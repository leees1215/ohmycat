//package com.project.ohmycat.service;
//
//import com.project.ohmycat.dto.LikeDto;
//import com.project.ohmycat.entity.Like;
//import com.project.ohmycat.repository.LikeRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class LikeService {
//
//    private final LikeRepository likeRepository;
//
//    public Like selectLike(Integer id) {
//        return likeRepository.findById(id).orElseThrow(() -> new RuntimeException());
//    }
//
//    public void insertLike(LikeDto dto) {
//
//        likeRepository.save(like);
//    }
//
//    public void updatelLike(LikeDto dto) { // UpdateBoardDto 수정 것
//
//        likeRepository.save(like);
//    }
//
//    public void deleteLike(Integer LikeKey) {
//        likeRepository.deleteById(likeKey);
//    }
//
//}
