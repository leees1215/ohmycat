package com.project.ohmycat.controller;

import com.project.ohmycat.dto.InsertComDto;

import com.project.ohmycat.entity.Comment;
import com.project.ohmycat.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/comment")

public class ComController {

    private final CommentService commentService;

    @GetMapping
    public List<Comment> findAllComment(@PathVariable("id") Integer id){
        return commentService.findAllComment(id);
    }

    @PostMapping("/commentRegister")
    public String insertComment(InsertComDto dto){
        commentService.insertComment(dto);
        return "redirect:/boardSelect/"+ dto.getBoardKey();
    }


    @PostMapping("/commentDelete")
    public String deleteComment(InsertComDto dto){
        System.out.println(dto);
        System.out.println(dto.getComKey());
        commentService.deleteComment(dto);
        return "redirect:/boardSelect/"+dto.getBoardKey();
    }

}
