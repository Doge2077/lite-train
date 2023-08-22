package com.train.member.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class MemberLoginReq {

    @NotBlank(message = "Phone number is null!")
    @Pattern(regexp = "^1\\d{10}$", message = "Phone number is invalided.")
    private String mobile;

    @NotBlank(message = "Valid code is null!")
    private String code;

}
