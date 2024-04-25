package com.kdt11.kdt.controller;

import com.kdt11.kdt.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {
    class Hello {
        private int age;

        public Hello(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    @GetMapping("/hi")
    public String getHi(Model model) { // Model model: 컨트롤러 클래스 안의 메소드가 파라미터로 받을 수 있는 객체

        model.addAttribute("msg", "hi~");
        model.addAttribute("uText", "<strong>Hello</strong>");
        model.addAttribute("value", "이름을 입력하세요.");
        model.addAttribute("with","hello");
        model.addAttribute("link","");
        model.addAttribute("img","철수.jpg");
        model.addAttribute("userRole", "guest");
        model.addAttribute("isAdmin", false);

        List<String> names = Arrays.asList("apple", "amazon", "samsung", "posco");
        model.addAttribute("names", names);

        Hello hello = new Hello(20);
        model.addAttribute("classHello", hello);

        model.addAttribute("age", 30);

        List<Person> people = new ArrayList<>();
        people.add(new Person("kim", 10));
        people.add(new Person("lee", 20));
        people.add(new Person("hong", 30));
        people.add(new Person("park", 40));
        people.add(new Person("shin", 50));
        model.addAttribute("people", people);




        return "hi";
    }
}
