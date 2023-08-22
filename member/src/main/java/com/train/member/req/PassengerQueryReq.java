package com.train.member.req;

import com.train.common.req.PageReq;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassengerQueryReq extends PageReq {

    private Long memberId;

    public PassengerQueryReq(@NotNull(message = "Page is null!") Integer page, @NotNull(message = "Message is null!") @Max(value = 100, message = "Message is limited to 100!") Integer size) {
        super(page, size);
    }

}
