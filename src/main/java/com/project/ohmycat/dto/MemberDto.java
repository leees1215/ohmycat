package com.project.ohmycat.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private Integer memKey;
    private String memId;
    private String memPw;
    private String memNickname;
    private String memEmail;
    private String memMobile;
    private Integer adminFlag;

}
