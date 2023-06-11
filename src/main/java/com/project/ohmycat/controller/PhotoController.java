//package com.project.ohmycat.controller;
//
//import com.project.ohmycat.dto.PhotoDto;
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
//        return photoService.selectPhoto(id);
//    }
//
//    @PutMapping
//    public void insertPhoto(@RequestBody PhotoDto dto){
//        photoService.insertPhoto(dto);
//
//    }
//
//    @PutMapping
//    public void updatePhoto(@RequestBody PhotoDto dto) {
//        photoService.updatePhoto(dto);
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
