//package com.project.ohmycat.service;
//
//import com.project.ohmycat.dto.ComDto;
//import com.project.ohmycat.dto.UpdateComDto;
//import com.project.ohmycat.entity.Comment;
//import com.project.ohmycat.repository.ComRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CommentService {
//
//    private final ComRepository comRepository;
//
//    public Comment selectCommentById(Integer id) {
//        return comRepository.findById(id).orElseThrow(RuntimeException::new);
//    }
//
//    public void insertComment(ComDto dto) {
//
//        Comment comment = Comment.builder()
//                .comContent(dto.get())
//                .commnetBy(1)
//                .build();
//        comRepository.save(comment);
//    }
//
//    public void updateComment(UpdateComDto dto) {
//        Comment comment = new Comment();
//        comment.updateComment(dto.getCommentContent()); // 변수
//        comRepository.save(comment);
//    }
//
//    public void deleteComment(Integer ComKey) {
//        comRepository.deleteById(ComKey);
//    }
//}
