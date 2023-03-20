package com.project.ohmycat.repository;

import com.project.ohmycat.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

//    @Query("SELECT m FROM Member m WHERE m.memId = :memId")
    Optional<Member> findMemberByMemId(String memId);
}
