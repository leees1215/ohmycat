package com.project.ohmycat.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Setter
@Getter
@ToString
public class Member extends BasicEntity {

    @Id
    @Column(name = "mem_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memKey;

    @Column(name = "mem_id", nullable = false)
    private String memId;

    @Column(name = "mem_pw", nullable = false)
    private String memPw;

    @Column(name = "mem_email", nullable = false)
    private String memEmail;

    @Column(name = "mem_mobile", nullable = false)
    private String memMobile;

    @Column(name = "admin_flag", nullable = false)
    private Integer adminFlag=0;

}
