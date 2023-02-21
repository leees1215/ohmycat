package com.project.ohmycat.entity;

import javax.persistence.*;

@Entity
@Table(name = "like")
public class Like extends BasicEntity{

    @Id
    @Column(name = "like_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LikeKey;

    @Column(name = "like_brd_key", nullable = false)
    private Integer LikeBrdKey;

    @Column(name = "like_by", nullable = false)
    private Integer LikeBy;
}
