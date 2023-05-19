package com.project.ohmycat.service;

import com.project.ohmycat.dto.InsertBoardDto;
import com.project.ohmycat.dto.InsertComDto;
import com.project.ohmycat.dto.UpdateBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Board selectBoardById(Integer id) {

        return boardRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Board> findAllBoard() {
        return boardRepository.findAll();
    }

    public void insertBoard(InsertBoardDto dto, Integer memKey) {

        Board board = Board.builder()
                .dto(dto)
                .boardBy(memKey)
                .build();
        boardRepository.save(board);
    }

    public void updateBoard(UpdateBoardDto dto) {
        Board board = boardRepository.findById(dto.getBoardKey()).orElseThrow(() -> new RuntimeException());
        board.updateBoard(dto.getBoardKey(), dto.getBoardTitle(), dto.getBoardContent()); // 변수
        boardRepository.save(board);
    }

    public void deleteBoard(Integer boardKey) {
        boardRepository.deleteById(boardKey);
    }

    public Board viewBoard(Integer id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new RuntimeException()); // 조회(boardKey)
        board.setBoardView(board.getBoardView()+1);//조회수++
        return boardRepository.save(board);// 저장
    }
}
