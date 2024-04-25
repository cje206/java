package com.kdt11.kdt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
}
