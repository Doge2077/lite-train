package com.train.member.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import com.train.common.context.LoginMemberContext;
import com.train.common.util.SnowUtil;
import com.train.member.domain.Passenger;
import com.train.member.mapper.MemberMapper;
import com.train.member.mapper.PassengerMapper;
import com.train.member.req.PassengerSaveReq;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    private static final Logger LOG = LoggerFactory.getLogger(PassengerService.class);

    @Resource
    private PassengerMapper passengerMapper;

    @Resource
    private MemberMapper memberMapper;

    public void save(PassengerSaveReq req) {
        DateTime nowTime = DateTime.now();
        Passenger passenger = BeanUtil.copyProperties(req, Passenger.class);
        if (ObjectUtil.isNull(passenger.getId())) {
            passenger.setId(SnowUtil.getSnowflakeNextId());
            passenger.setMemberId(LoginMemberContext.getId());
            passenger.setCreateTime(nowTime);
            passenger.setUpdateTime(nowTime);
            passengerMapper.insert(passenger);
        } else {
            passenger.setUpdateTime(nowTime);
            passengerMapper.updateByPrimaryKey(passenger);
        }
    }
}
