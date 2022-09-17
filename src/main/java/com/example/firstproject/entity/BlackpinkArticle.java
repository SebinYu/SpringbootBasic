package com.example.firstproject.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
public class BlackpinkArticle {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String header;

    @Column
    private String content;

    public BlackpinkArticle(Long id, String header, String content) {
        this.id = id;
        this.header = header;
        this.content = content;
    }

    public BlackpinkArticle() {

    }


    @Override
    public String toString() {
        return "BlackpinkArticle{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
