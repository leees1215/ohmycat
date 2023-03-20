package com.project.ohmycat.controller;

import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public Member selectMember(@PathVariable("id") Integer key) {
        return memberService.selectMemberById(key); //한명만 조회
    }

    @GetMapping
    public List<Member> findAllMember() {
        return memberService.findAllMember(); // 전체조회
    }

    @PostMapping
    public void insertMember(@RequestBody Member member) {
        memberService.insertMember(member);


    }

    @PutMapping
    public void updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable("id") Integer id) {
        memberService.deleteMember(id);
    }


}
