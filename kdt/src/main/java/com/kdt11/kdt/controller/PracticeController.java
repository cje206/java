package com.kdt11.kdt.controller;

import com.kdt11.kdt.dtos.User;
import com.kdt11.kdt.dtos.UserDto;
import com.kdt11.kdt.dtos.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PracticeController {
    @GetMapping("/introduce/{name}")
    public String introduce(@PathVariable String name, Model model) {
        model.addAttribute("name", name);

        return "introduce";
    }

    @GetMapping("/introduce2")
    public String introduce2(@RequestParam(name = "name") String name,
                             @RequestParam(name = "age") String age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "introduce";
    }

    @GetMapping("/postPractice")
    public String postPractice() {
        return "postPractice";
    }

    @PostMapping("/postForm")
    public String postForm(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "gender") String gender,
            @RequestParam(value = "year") String year,
            @RequestParam(value = "month") String month,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "interest") List<String> interest, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("birth", year+"년"+month+"월"+date+"일");
        model.addAttribute("interest", String.join(", ", interest));
        return "practice4";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/result")
    public String result(
            @RequestParam String name,
            @RequestParam String gender,
            @RequestParam String birthDate,
            @RequestParam List<String> interest, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("birthDate", birthDate);
        model.addAttribute("interests", String.join(", ", interest));
        return "result";
    }

    @PostMapping("/axios/practice9")
    @ResponseBody
    public String result(@RequestBody UserInfo userInfo) {
        String msg = userInfo.getName() + " 회원가입 성공";
        return msg;
    }

    @GetMapping("/practice10")
    public String practice10() {
        return "practice10";
    }

    List<User> users = new ArrayList<>();

    @PostMapping("/practice10/signup")
    @ResponseBody
    public String signup(@RequestBody User newUser) {
        for(User user: users) {
            if(user.getUserId().equals(newUser.getUserId())) {
                return "이미 존재하는 아이디";
            }
        }
        users.add(newUser);
        return newUser.getName() + " 회원가입 성공";
    }

    @GetMapping("/practice10/login")
    @ResponseBody
    public String login(@RequestParam String userId, @RequestParam String pw) {
        for(User user: users) {
            if(user.getUserId().equals(userId)) {
                if(user.getPw().equals(pw)) {
                    return user.getName() + " 로그인 성공";
                } else {
                    return "비밀번호 오류";
                }
            }
        }
        return "회원정보 없음";
    }
    
    @PatchMapping("/practice10/user")
    @ResponseBody
    public String editUser(@RequestBody User newUser) {
        for(User user: users) {
            if(user.getUserId().equals(newUser.getUserId())) {
                user.setPw(newUser.getPw());
                return user.getName() + " 회원 정보 변경 완료";
            }
        }
        return "회원 정보 없음";
    }
    
    @DeleteMapping("/practice10/user")
    @ResponseBody
    public String deleteUser(@RequestBody User delUser){
        for(User user: users) {
            if(user.getUserId().equals(delUser.getUserId())) {
                if(user.getPw().equals(delUser.getPw())) {
                    users.remove(user);
                    return " 회원 정보 삭제 완료";
                } else {
                    return "비밀번호 오류";
                }
            }
        }
        return "회원 정보 없음";
    }

//    실습10: 회원 관리 시스템 풀이
    private Map<String, UserDto> exUsers = new HashMap<>();

//    회원가입
    @PostMapping("/practice10ex/register")
    @ResponseBody
    public String practice10Register(@RequestBody UserDto userDto) {
        if(exUsers.containsKey(userDto.getEmail())) {
            return "이미 존재하는 이메일 입니다.";
        }
        exUsers.put(userDto.getEmail(), userDto);
        return "OK";
    }

//    로그인
    @PostMapping("/practice10ex/login")
    @ResponseBody
    public String practice10Login(@RequestBody UserDto userDto) {
        UserDto exists = exUsers.get(userDto.getEmail());
        if(exists != null && exists.getPassword().equals(userDto.getPassword())) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

//    수정
    @PutMapping("/practice10ex/{email}")
    @ResponseBody
    public String practice10Put(@PathVariable String email, @RequestBody UserDto userDto) {
        if(!exUsers.containsKey(email)) {
            return "존재하지 않는 사용자입니다.";
        }
        exUsers.put(email, userDto);
        return "OK";
    }

//    삭제
    @DeleteMapping("/practice10ex/{email}")
    @ResponseBody
    public String practice10Delete(@PathVariable String email) {
        if(!exUsers.containsKey(email)) {
            return "존재하지 않는 사용자입니다.";
        }
        exUsers.remove(email);
        return "OK";
    }
}
