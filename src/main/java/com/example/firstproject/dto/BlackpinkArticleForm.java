package com.example.firstproject.dto;

import com.example.firstproject.entity.BlackpinkArticle;

public class BlackpinkArticleForm {
    private String header;
    private String content;

    public BlackpinkArticleForm(String header, String content) {
        this.header = header;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BlackpinkArticleForm{" +
                "header='" + header + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public BlackpinkArticle toEntity() {

        return new BlackpinkArticle(null, header, content);
    }

}
