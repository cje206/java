package com.kdt11.kdt.controller;

import com.kdt11.kdt.dtos.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class VoController {
//    실습 8. Axios - VO
    @GetMapping("/axios/vo/response1")
    @ResponseBody
    public String axiosvoAPI1(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        String msg = "이름 : " + name + "\n나이 : " + age;
        return msg;
    }

    @GetMapping("/axios/vo/response2")
    @ResponseBody
    public String axiosvoAPI2(UserVo userVo) {
        String msg = "이름 : " + userVo.getName() + "\n나이 : " + userVo.getAge();
        return msg;
    }

    @PostMapping("/axios/vo/response3")
    @ResponseBody
    public String axiosvoAPI3(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        String msg = "이름 : " + name + "\n나이 : " + age;
        return msg;
    }

    @PostMapping("/axios/vo/response4")
    @ResponseBody
    public String axiosvoAPI4(UserVo userVo) {
        String msg = "이름 : " + userVo.getName() + "\n나이 : " + userVo.getAge();
        return msg;
    }

    @PostMapping("/axios/vo/response5")
    @ResponseBody
    public String axiosvoAPI5(@RequestBody UserVo userVo) {
        String msg = "이름 : " + userVo.getName() + "\n나이 : " + userVo.getAge();
        return msg;
    }
}
