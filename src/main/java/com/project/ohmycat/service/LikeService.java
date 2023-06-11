package com.project.ohmycat.service;

import com.project.ohmycat.dto.LikeDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Comment;
import com.project.ohmycat.entity.Like;
import com.project.ohmycat.repository.BoardRepository;
import com.project.ohmycat.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LikeService {

    private final LikeRepository likeRepository;
    private final BoardRepository boardRepository;

    public void insertLike(LikeDto dto) {

        Board board = boardRepository.findById(dto.getLikeBrdKey()).orElseThrow(RuntimeException::new);

        Like like1 = Like.builder()
                .likeBy(dto.getLikeBy())
                .likeBrdKey(dto.getLikeBrdKey())
                .build();
        likeRepository.save(like1);
    }

    public void deleteLike(Integer likeKey) {
        likeRepository.deleteById(likeKey);
    }

    public Integer countByLikeBrdKey(Integer likeBrdKey, Integer likeBy) {


        if(likeRepository.countByLikeBrdKeyAndLikeBy(likeBrdKey,likeBy) > 0){
            likeRepository.deleteById(countByLikeBrdKey(likeBrdKey, likeBy));//없애는 로직
            System.out.println(countByLikeBrdKey(likeBrdKey,likeBy));
        }else if (likeRepository.countByLikeBrdKeyAndLikeBy(likeBrdKey,likeBy)==0){
            likeRepository.countByLikeBrdKeyAndLikeBy(1);

            // 추가
            //넣는 로직
        }
        return 0;
    }
}

