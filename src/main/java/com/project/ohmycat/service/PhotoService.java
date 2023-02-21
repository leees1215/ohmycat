//package com.project.ohmycat.service;
//
//import com.project.ohmycat.dto.PhotoDto;
//import com.project.ohmycat.entity.Photo;
//import com.project.ohmycat.repository.PhotoRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class PhotoService {
//
//    private final PhotoRepository photoRepository;
//
//    public Photo selectLike(Integer id) {
//        return photoRepository.findById(id).orElseThrow(() -> new RuntimeException());
//    }
//
//    public void insertPhoto(PhotoDto dto) {
//
//        photoRepository.save(photo);
//    }
//
//    public void updatePhoto(PhotoDto dto) { // UpdateBoardDto 수정 것
//
//        photoRepository.save(photo);
//    }
//
//    public void deletePhoto(Integer PhotoKey) {
//        photoRepository.deleteById(photoKey);
//    }
//}
