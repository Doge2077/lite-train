package com.train.member.controller;

import com.train.common.resp.CommonResp;
import com.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.train.member.req.MemberRegisterReq;


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

    @PostMapping("register")
    public CommonResp<Long> register(MemberRegisterReq req) {
        Long register =  memberService.register(req);
        return new CommonResp<Long>(register);
    }

}
