package com.train.member.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MemberRegisterReq {

    @NotBlank(message = "Phone number is null !")
    private String mobile;

}
