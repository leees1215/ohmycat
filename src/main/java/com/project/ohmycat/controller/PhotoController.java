//package com.project.ohmycat.controller;
//
//import com.project.ohmycat.entity.Photo;
//import com.project.ohmycat.service.PhotoService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping(value = "Photo")
//
//public class PhotoController {
//    private final PhotoService photoService;
//
//
//    @GetMapping("/{id}")
//    public Photo selectPhoto (@PathVariable("id") Integer id) {
//        return photoService.selectPhotoById(id);
//    }
//
//    @PutMapping
//    public void insertPhoto(@RequestBody PhotoDto dto){
//
//    }
//
//    @PutMapping
//    public void updatePhoto(@RequestBody Photo photo) {
//        photoService.updatePhoto(photo);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteMember(@PathVariable("id") Integer id) {
//        photoService.deletePhoto(id);
//    }
//
//
//
//}
