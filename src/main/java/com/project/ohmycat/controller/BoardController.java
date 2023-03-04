package com.project.ohmycat.controller;

import com.project.ohmycat.dto.InsertBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "Board")

public class BoardController {

    private final BoardService boardService;


    @GetMapping("/{id}")
    public Board selectBoard (@PathVariable ("id") Integer id) {
        return boardService.selectBoardById(id);
    }

    @GetMapping("/")
    public List<Board> findAllBoard(){
        return boardService.findAllBoard();
    }

    @PutMapping
    public void insertBoard(@RequestBody InsertBoardDto dto){
        boardService.insertBoard(dto);
    }

    @PostMapping
    public Board updateBoard(@PathVariable ("id") Integer id){ return boardService.selectBoardById(id);}

    @DeleteMapping
    public void deleteBoard(){

    }

}
