package com.kdt11.kdt.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private int age;
    private String password;

//    RequestBody 지정한 DTO에는 기본 생성자가 필요할 수도 있다.
    public UserDto() {}

//    public UserDto(String name, String email, int age) {
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }
}
