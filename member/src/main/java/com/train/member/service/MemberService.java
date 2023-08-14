package com.train.member.service;

import com.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Resource
    private MemberMapper memberMapper;

    public Integer countMember() {
        return memberMapper.countMember();
    }

}
