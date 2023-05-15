package com.project.ohmycat.controller;

import com.project.ohmycat.dto.InsertBoardDto;
import com.project.ohmycat.dto.InsertComDto;
import com.project.ohmycat.dto.UpdateBoardDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Comment;
import com.project.ohmycat.entity.Member;
import com.project.ohmycat.service.BoardService;
import com.project.ohmycat.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardpageController {

    private final BoardService boardService;
    private final CommentService commentService;


    @RequestMapping("/boardPage")
    public String findAllboard(Model model) {
        List<Board> boardList = boardService.findAllBoard();
        model.addAttribute("list3", boardList);
        return "Board.html";

    }

    @RequestMapping("/boardSelect/{id}")
    public String selectBoard(Model model, @PathVariable("id") Integer key, HttpSession session) {
        Board board = boardService.selectBoardById(key);
        List<Comment> commentList = commentService.findAllComment(key);

        model.addAttribute("board", boardService.selectBoardById(key));
        model.addAttribute("comment", commentList);



        Object memKey = session.getAttribute("memKey");
        Integer adminFlag = (Integer) session.getAttribute("adminFlag");

        if (memKey == null) {
            return "Member/Login.html";
        }
        if(adminFlag != null){ // 관리자가 아니면? 사용자화면
            if (adminFlag != 1) {
                System.out.println("관리자가 아닙니다");
            } else {
                System.out.println("관리자");
            }
            return "Member/Login.html";
        } else {
            System.out.println("");
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

    @RequestMapping("/boardRegister2") // 게시글 작성 페이지에서 로그인유무 확인 후 게시글 작성
    public String registerBoard2(InsertBoardDto dto, HttpSession session){
        Integer memKey = (Integer) session.getAttribute("memKey");
        if (memKey == null) {
            return "Member/Login.html";
        }
        boardService.insertBoard(dto, memKey);
        return "redirect:/boardPage";

    }

    @RequestMapping("/boardDelete")
    public String deleteBoard(InsertBoardDto dto){
        System.out.println(dto);
        System.out.println(dto.getBoardKey());
//        boardService.deleteBoard(dto);
        return "redirect:/boardPage";
    }




}
