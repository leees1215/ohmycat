package com.project.ohmycat.controller;

import com.project.ohmycat.dto.UpdateBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardpageController {

    private final BoardService boardService;


    @RequestMapping("/boardPage")
    public String findAllboard(Model model) {
        List<Board> boardList = boardService.findAllBoard();
        model.addAttribute("list3", boardList);
        return "Board.html";

    }

    @RequestMapping("/boardSelect/{id}")
    public String selectboard(Model model, @PathVariable("id") Integer key){
        Board board = boardService.selectBoardById(key);
        model.addAttribute("board",boardService.selectBoardById(key));
        return "Boardfind.html";
    }

    @RequestMapping("/boardUpdate/{id}")
    public String updateboard(Model model, @PathVariable("id") Integer key) {
        Board board = boardService.selectBoardById(key);
        model.addAttribute("board", boardService.selectBoardById(key));
        return "Boardupdate.html";
    }


    @RequestMapping("/boardUpdate")
    public String updateboard(UpdateBoardDto updateBoardDto){
        boardService.updateBoard(updateBoardDto);
        return "redirect:/boardSelect/" + updateBoardDto.getBoardKey();
    }


//    @RequestMapping("/boardRegister/{id]")
//    public String registerboard(){
//
//    }








}
