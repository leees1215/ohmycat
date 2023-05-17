package com.project.ohmycat.controller;


import com.project.ohmycat.dto.MemberDto;
import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MemberPageController {


    private final MemberService memberService;


    @RequestMapping("/loginPage") //로그인페이지
    public String insertMember(){

        return "Member/Login.html";
    }

    @RequestMapping("/joinPage") //회원가입페이지
    public String insertMember2() {
        return "Member/Join.html";
    }

    @RequestMapping("/memberInsert") //회원가입->로그인페이지
    public String insertMember(Member member){
        memberService.insertMember(member);
        return "redirect:/Member/Login.html";
    }

    @RequestMapping("/memberFind") // 멤버 전체조회
    public String findMember(Model model){
        model.addAttribute("list",memberService.findAllMember());
        return "Member/Find.html";
    }

    @RequestMapping("/memberUpdate/{id}") // 멤버 수정하는 페이지
    public String updateMember(Model model, @PathVariable("id") Integer key){
        Member member = new Member();
        member.setMemKey(key);
        model.addAttribute("member", memberService.selectMemberById(key));
        return "Member/FindtoUpdate.html";
    }





}
