package com.project.ohmycat.service;

import com.project.ohmycat.dto.PhotoDto;
import com.project.ohmycat.entity.Photo;
import com.project.ohmycat.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhotoService {

    private final PhotoRepository photoRepository;

    public void insertPhoto(PhotoDto dto) {

        int[][] arr = {{1,2},{3,4}};
        System.out.println(arr[0][1]);

    }


    public void deletePhoto(Integer photoKey) {
        photoRepository.deleteById(photoKey);
    }
}
