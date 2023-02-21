package com.project.ohmycat.entity;

import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    @CreatedDate
    @Column(updatable = false)
    @Comment("데이터 생성 시간")
    private LocalDateTime createTime;

    @LastModifiedDate
    @Comment("데이터 수정 시간")
    private LocalDateTime updateTime;

    @Comment("데이터 삭제 시간")
    private LocalDateTime deleteTime;

}
