package com.train.member.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PassengerTypeEnum {

    ADULT("1", "成人"),
    CHILD("2", "儿童"),
    STUDENT("3", "学生");

    private String code;

    private String desc;

}
