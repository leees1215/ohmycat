package com.project.ohmycat.controller;

import com.project.ohmycat.dto.LikeDto;
import com.project.ohmycat.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/like")


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
    public Integer like(Integer likeBrdKey, HttpSession session){
        Object memKey = session.getAttribute("memKey");

        System.out.println("API 호출");
        if(memKey != null){
            likeService.countByLikeBrdKey(likeBrdKey, (Integer) memKey);
            return 0;
        } else{
            return -1;
            //System.out.println(session.getAttribute("memKey"));
        }

    }

}
