package com.train.batch.fegin;

import com.train.common.resp.CommonResp;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BusinessFeignFallback implements BusinessFeign {

    @Override
    public CommonResp<Object> genDaily(Date date) {
        return null;
    }
}
