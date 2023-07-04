package com.project.ohmycat.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Entity
@Table(name = "like_brd")
@NoArgsConstructor
public class Like {

    @Id
    @Column(name = "like_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeKey;

    @Column(name = "like_brd_key", nullable = false)
    private Integer likeBrdKey;

    @Column(name = "like_by", nullable = false)
    private Integer likeBy;

    @CreatedDate
    @Column(updatable = false)
    @org.hibernate.annotations.Comment("데이터 생성 시간")
    private LocalDateTime createTime;

    @Builder
    public Like(Integer likeBrdKey, Integer likeBy) {
        this.likeBrdKey = likeBrdKey;
        this.likeBy = likeBy;
        this.createTime = LocalDateTime.now();
    }
}
