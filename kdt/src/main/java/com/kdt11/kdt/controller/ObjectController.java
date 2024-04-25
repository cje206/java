package com.kdt11.kdt.controller;

import com.kdt11.kdt.dtos.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ObjectController {

    @GetMapping("/dtoform")
    public String dtoform() {
        return "dtoform";
    }

    @GetMapping("/user1")
    public String user1(Model model) {
//        DTO를 사용 안 한다고 가정
//        UserDto noDto = new UserDto("홍길동", "abc@exam.com", 20);
//        model.addAttribute("name", noDto.getName());
//        model.addAttribute("email", noDto.getEmail());
//        model.addAttribute("age", noDto.getAge());

//        DTO를 사용
        UserDto user = new UserDto("성춘향", "xyz@exam.com", 19);
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping("/user1")
    public String postUser(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("user", userDto);
        return "user";
    }
}
