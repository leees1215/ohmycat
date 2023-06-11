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
//    public Photo selectPhoto(Integer id) {
//        return photoRepository.findById(id).orElseThrow(() -> new RuntimeException());
//    }
//
//    public void insertPhoto(PhotoDto dto) {
//
//        photoRepository.save(dto.);
//    }
//
//    public void updatePhoto(PhotoDto dto) {
//
//        photoRepository.save(dto.);
//    }
//
//    public void deletePhoto(Integer photoKey) {
//        photoRepository.deleteById(photoKey);
//    }
//}
