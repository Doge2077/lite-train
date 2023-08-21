package com.train.member.controller;

import com.train.common.resp.CommonResp;
import com.train.member.req.MemberRegisterReq;
import com.train.member.req.MemberSendCodeReq;
import com.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @RequestMapping("/count")
    public CommonResp<Integer> count() {
        Integer count =  memberService.countMember();
        CommonResp<Integer> commonResp = new CommonResp<>();
        commonResp.setContent(count);
        return commonResp;
    }

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq req) {
        Long register =  memberService.register(req);
        return new CommonResp<Long>(register);
    }

    @PostMapping("/send-code")
    public CommonResp<Long> sendCode(@Valid MemberSendCodeReq req) {
        memberService.sendCode(req);
        return new CommonResp<>();
    }

}
