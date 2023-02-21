package com.project.ohmycat.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment extends BasicEntity{

    @Id
    @Column(name = "com_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comKey;

    @Column(name = "com_content", nullable = false)
    private String comContent;

    @Builder
    public Comment(String comContent) {
        this.comContent = comContent;
    }
}
