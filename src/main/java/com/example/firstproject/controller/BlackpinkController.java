package com.example.firstproject.controller;

import com.example.firstproject.dto.BlackpinkArticleForm;
import com.example.firstproject.entity.BlackpinkArticle;
import com.example.firstproject.repository.BlackpinkArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlackpinkController {

    @Autowired// 스프링 부트가 미리 생성해놓은 리파지터리 객체를 가져옴(DI)
    private BlackpinkArticleRepository blackpinkArticleRepository;

    @GetMapping("/blackpink")
    public String blackpinkMV(Model model){
        model.addAttribute("latestRelease", "SHUT DOWN");
        model.addAttribute("group", "BLACKPINK");
        return "blackpink";
    }

    @PostMapping("/blackpink")
    public String createArticle(BlackpinkArticleForm form){
        System.out.println(form.toString());

        // 1. Dto를 Entity 변환
        BlackpinkArticle article2 = form.toEntity();
        System.out.println(article2.toString());

        // 2. Repository에게 Entity를 DB로 저장하게 함
        BlackpinkArticle saved = blackpinkArticleRepository.save(article2);
        System.out.println(saved.toString());
        return "";
    }


}
