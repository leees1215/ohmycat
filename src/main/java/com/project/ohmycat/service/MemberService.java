package com.project.ohmycat.service;

import com.project.ohmycat.entity.Member;
import com.project.ohmycat.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;


    public Member selectMemberById(Integer id) {
        return memberRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }

    public void insertMember(Member member) {

        memberRepository.save(member);
    }

    public void updateMember(Member member) {

//        Member member1  = memberRepository.findById(member.getMemKey()).orElseThrow(() -> new RuntimeException());
//        member1.setMemId(member.getMemId());
//        member1.setMemPw(member.getMemPw());
//        member1.setMemMobile(member.getMemMobile());
//        member1.setMemEmail(member.getMemEmail());
        memberRepository.save(member);
    }

    public void deleteMember(Integer memberKey) {

        memberRepository.deleteById(memberKey);
    }


}
