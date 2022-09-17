package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "가수");
        return "greetings";
    }

    @GetMapping("/blackpink")
    public String blackpinkMV(Model model){
        model.addAttribute("latestRelease", "SHUT DOWN");
        model.addAttribute("group", "BLACKPINK");
        return "blackpink";
    }

    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("nickname", "홍길");
        return "goodbye";
    }
}
