package com.project.ohmycat.controller;

import com.project.ohmycat.dto.LikeDto;
import com.project.ohmycat.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "Like")


public class LikeController {


    private final LikeService likeService;


    @PutMapping
    public void insertLike(@RequestBody LikeDto dto){
        likeService.insertLike(dto);
    }

    @DeleteMapping
    public void deleteLike(@RequestBody LikeDto dto){
        likeService.deleteLike(dto.getLikeKey());
    }

    @GetMapping("/board/like")
    public Integer like(Integer likeBrdKey,Integer likeBy, HttpSession session){
        Object memKey = session.getAttribute("memKey");

        if(memKey != null){
            return -1;
        } else if(memKey != null){
            return 0;
            //System.out.println(session.getAttribute("memKey"));
        }
    return 0;
    }
}
