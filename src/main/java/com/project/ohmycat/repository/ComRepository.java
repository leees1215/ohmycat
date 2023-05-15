package com.project.ohmycat.repository;

import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComRepository extends JpaRepository<Comment,Integer> {


    List<Comment> findCommentsByBoard(Board board);
}


