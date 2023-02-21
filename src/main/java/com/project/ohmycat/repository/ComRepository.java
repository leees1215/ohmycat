package com.project.ohmycat.repository;

import com.project.ohmycat.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComRepository extends JpaRepository<Comment,Integer> {
}
