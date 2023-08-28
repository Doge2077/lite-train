package com.train.business.req;

import com.train.common.req.PageReq;
import lombok.Data;

@Data
public class TrainSeatQueryReq extends PageReq {

    private String trainCode;
    @Override
    public String toString() {
        return "TrainSeatQueryReq{" +
                "} " + super.toString();
    }

}
