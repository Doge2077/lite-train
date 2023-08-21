package com.train.member.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class MemberSendCodeReq {

    @NotBlank(message = "Phone number is null !")
    @Pattern(regexp = "^1\\d{10}$", message = "Phone number is invalided.")
    private String mobile;

}
