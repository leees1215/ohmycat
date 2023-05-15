package com.project.ohmycat.service;

import com.project.ohmycat.dto.InsertComDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Comment;
import com.project.ohmycat.repository.BoardRepository;
import com.project.ohmycat.repository.ComRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final ComRepository comRepository;

    private final BoardRepository boardRepository;

    public Comment selectCommentById(Integer id) {
        return comRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Comment> findAllComment(Integer key) {
        Board board = boardRepository.findById(key).orElseThrow(RuntimeException::new);
        return comRepository.findCommentsByBoard(board);
    }

    public void insertComment(InsertComDto dto) {

        Board board = boardRepository.findById(dto.getBoardKey()).orElseThrow(RuntimeException::new);

        Comment comment = Comment.builder()
                .comContent(dto.getComContent())
                .board(board)
                .build();
        comRepository.save(comment);
    }

    public void deleteComment(InsertComDto dto) {
        comRepository.deleteById(dto.getComKey());
    }
}
