package com.train.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello word";
    }

}
