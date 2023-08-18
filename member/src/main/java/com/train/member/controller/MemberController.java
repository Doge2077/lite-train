package com.train.member.controller;

import com.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @RequestMapping("/count")
    public Integer count() {
        return memberService.countMember();
    }

    @PostMapping("register")
    public Long register(String mobile) {
        return memberService.register(mobile);
    }

}
