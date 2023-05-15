package com.project.ohmycat.service;

import com.project.ohmycat.dto.InsertBoardDto;
import com.project.ohmycat.dto.UpdateBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public void updateBoard(UpdateBoardDto dto) { // UpdateBOardDto 수정 것
        Board board = boardRepository.findById(dto.getBoardKey()).orElseThrow(() -> new RuntimeException());
        board.updateBoard(dto.getBoardKey(), dto.getBoardTitle(), dto.getBoardContent()); // 변수
        boardRepository.save(board);
    }

    public void deleteBoard(Integer boardKey) {
        boardRepository.deleteById(boardKey);
    }


}
