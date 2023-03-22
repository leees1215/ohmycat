package com.project.ohmycat.controller;

import com.project.ohmycat.dto.InsertBoardDto;
import com.project.ohmycat.dto.UpdateBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
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
    public String selectBoard(Model model, @PathVariable("id") Integer key, HttpSession session) {
        Board board = boardService.selectBoardById(key);
        model.addAttribute("board", boardService.selectBoardById(key));

        Object memKey = session.getAttribute("memKey");

        if (memKey == null) {
            return "Member/Login.html";
        }

        return "Boardfind.html";
    }

    @RequestMapping("/boardUpdate/{id}")
    public String updateBoard(Model model, @PathVariable("id") Integer key) {
        Board board = boardService.selectBoardById(key);
        model.addAttribute("board", boardService.selectBoardById(key));
        return "Boardupdate.html";
    }


    @RequestMapping("/boardUpdate")
    public String updateBoard(UpdateBoardDto updateBoardDto) {
        boardService.updateBoard(updateBoardDto);
        return "redirect:/boardSelect/" + updateBoardDto.getBoardKey();
    }

    @RequestMapping("/boardRegister")//게시글 작성 페이지로 이동
    public String registerBoard(InsertBoardDto dto){

        return "BoardRegister.html";

    }

    @RequestMapping("/boardRegister2")
    public String registerBoard2(InsertBoardDto dto){
        boardService.insertBoard(dto);
        return "redirect:/boardPage";

    }


}
