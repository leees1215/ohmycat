package com.project.ohmycat.controller;


import com.project.ohmycat.dto.MemberDto;
import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor

public class MemberPageController {


    private final MemberService memberService;


    @RequestMapping("/loginPage")
    public String insertMember(){

        return "Member/Login.html";
    }

    @RequestMapping("/joinPage")
    public String insertMember2(Member member) {
        memberService.insertMember(member);
        return "Member/Join.html";
    }




    // JWT Spring - Security
    // 로그인 페이지 작성
    // 로그인 성공,실패로직



}
