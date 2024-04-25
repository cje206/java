package com.kdt11.kdt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//@Controller
@RestController
//RestController 어노테이션을 사용하면 더 이상 템플릿을 사용하는 것이 아닌 데이터를 출력하는 것.
public class GetController {

    @GetMapping("/greet")
    @ResponseBody
    public String greeting(@RequestParam(name = "abc", required = false, defaultValue = "안녕") String abc,
                           @RequestParam(name = "zyx") String zyx,
                           Model model) {
        model.addAttribute("name", abc);
        model.addAttribute("name2", zyx);
        return "greet";
    }

    @GetMapping("/greets/{value}/{abc}")
    public  String greetsing(@PathVariable String value, @PathVariable("abc") String zyx, Model model) {
        model.addAttribute("name", value);
        model.addAttribute("name2", zyx);
        return "greet";
    }

    @GetMapping("/rest")
    @ResponseBody
    public String rest(@RequestParam String value) {
        return "Hello " + value;
    }

}
