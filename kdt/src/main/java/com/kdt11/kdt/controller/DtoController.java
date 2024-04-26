package com.kdt11.kdt.controller;

import com.kdt11.kdt.dtos.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DtoController {

    @GetMapping("/dto")
    public String dto() {
        return "dto";
    }

    @GetMapping("/dto/response1")
    @ResponseBody
    public String dtoResponse1(@ModelAttribute UserDto userDto, Model model) {
//        model.addAttribute("name", userDto.getName());
//        model.addAttribute("age", userDto.getAge());
//        return "API";
        String msg = userDto.getName() + ", " + userDto.getAge();
        return msg;
    }

    @PostMapping("/dto/response2")
    @ResponseBody
    public String dtoResponse2(@ModelAttribute UserDto userDto, Model model) {
//        model.addAttribute("name", userDto.getName());
//        model.addAttribute("age", userDto.getAge());
//        return "API";
        String msg = userDto.getName() + ", " + userDto.getAge();
        return msg;
    }

    @PostMapping("/dto/response3")
    @ResponseBody
    public String dotResponse3(@RequestBody UserDto userDto, Model model) {
//        model.addAttribute("name", userDto.getName());
//        model.addAttribute("age", userDto.getAge());
//        return "API";
        String msg = userDto.getName() + ", " + userDto.getAge();
        return msg;
    }


    //    실습 7. Axios - DTO
    @GetMapping("/axios")
    public String axios() {
        return "axios";
    }

    @GetMapping("/axios/response1")
    @ResponseBody
    public String axiosAPI1(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        String msg = "이름 : " + name + "\n나이 : " + age;
        return msg;
    }

    @GetMapping("/axios/response2")
    @ResponseBody
    public String axiosAPI2(UserDto userDto) {
        String msg = "이름 : " + userDto.getName() + "\n나이 : " + userDto.getAge();
        return msg;
    }

    @PostMapping("/axios/response3")
    @ResponseBody
    public String axiosAPI3(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        String msg = "이름 : " + name + "\n나이 : " + age;
        return msg;
    }

    @PostMapping("/axios/response4")
    @ResponseBody
    public String axiosAPI4(UserDto userDto) {
        String msg = "이름 : " + userDto.getName() + "\n나이 : " + userDto.getAge();
        return msg;
    }

    @PostMapping("/axios/response5")
    @ResponseBody
    public String axiosAPI5(@RequestBody UserDto userDto) {
        String msg = "이름 : " + userDto.getName() + "\n나이 : " + userDto.getAge();
        return msg;
    }

}
