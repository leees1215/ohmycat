package com.project.ohmycat.service;

import com.project.ohmycat.dto.MemberDto;
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

        Member member1  = memberRepository.findById(member.getMemKey()).orElseThrow(() -> new RuntimeException());

        member1.setMemId(member.getMemId());
        member1.setMemPw(member.getMemPw());
        member1.setMemMobile(member.getMemMobile());
        member1.setMemEmail(member.getMemEmail());
        member1.setAdminFlag(member.getAdminFlag());

        System.out.println(member1);
        memberRepository.save(member1);
    }

    public void deleteMember(Integer memberKey) {

        memberRepository.deleteById(memberKey);
    }

    public Member login(MemberDto memberDto){

        try {
            // 로직
            Member member1 = memberRepository.findMemberByMemId(memberDto.getMemId()).orElseThrow(() -> new RuntimeException());
//            System.out.println(member1.toString());
            if (member1.getMemPw().equals(memberDto.getMemPw())) {
                return member1;
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }

    }


}
