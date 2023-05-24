package com.project.ohmycat.controller;


import com.project.ohmycat.dto.MemberDto;
import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

    @RequestMapping("/login") //
    public String loginMember(MemberDto memberDto, HttpSession session){
        Member member = memberService.login(memberDto);
        if(member != null){
            session.setAttribute("memKey", member.getMemKey());
            session.setAttribute("admin", member.getAdminFlag());
            System.out.println(session.getAttribute("memKey"));
            return "redirect:/mainPage";
        }
        return "Member/Login.html";
    }
    @RequestMapping("/logout")
    public String logoutMember(HttpSession session){
        session.invalidate();
        return "redirect:/mainPage";

    }




}
