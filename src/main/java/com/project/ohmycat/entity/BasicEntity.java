package com.project.ohmycat.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public abstract class BasicEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(updatable = false)
    @Comment("데이터 생성자")
    private Long createBy;

    @LastModifiedBy
    @Comment("데이터 수정자")
    private Long updateBy;

    @Column(name = "delete_flag" , columnDefinition = "integer default 0")
    @Comment("데이터 삭제 유무")
    private Long delFlag;
}
