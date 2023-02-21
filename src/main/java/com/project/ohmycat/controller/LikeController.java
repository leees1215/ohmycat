//package com.project.ohmycat.controller;
//
//import com.project.ohmycat.dto.LikeDto;
//import com.project.ohmycat.entity.Like;
//import com.project.ohmycat.service.LikeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping(value = "Like")
//
//
//public class LikeController {
//
//
//    private final LikeService likeService;
//
//
//    @GetMapping("/{id}")
//    public Like selectLike (@PathVariable("id") Integer id) {
//        return likeService.selectLikeById(id);
//    }
//
//    @PutMapping
//    public void insertLike(@RequestBody LikeDto dto){
//        likeService.insertLike(dto);
//    }
//
//    @PostMapping
//    public void updateLike(){
//
//    }
//
//    @DeleteMapping
//    public void deleteLike(){
//
//    }
//}
