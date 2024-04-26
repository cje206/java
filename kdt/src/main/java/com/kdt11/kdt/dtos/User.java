package com.kdt11.kdt.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String userId;
    private String pw;

    public User() {}
}
