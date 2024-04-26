package com.kdt11.kdt.dtos;

import lombok.Getter;

@Getter
public class UserVo {
    private String name;
    private String age;

    public UserVo (String name, String age) {
        this.name = name;
        this.age = age;
    }
}
