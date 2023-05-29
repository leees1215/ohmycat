package com.project.ohmycat.repository;

import com.project.ohmycat.entity.Member;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {


//    @Query("SELECT m FROM Member m WHERE m.memId = :memId")
    Optional<Member> findMemberByMemId(String memId);

//    @Query("SELECT o FROM Member m WHERE m.memId = :memId")
    Long countByMemNickname(String memNickname);

    @Query("SELECT COUNT(m) FROM Member m WHERE m.memId = :memId")
    Long countByMemId(String memId);

}
