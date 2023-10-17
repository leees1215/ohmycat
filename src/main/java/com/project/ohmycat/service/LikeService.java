package com.project.ohmycat.service;

import com.project.ohmycat.dto.LikeDto;
import com.project.ohmycat.entity.Board;
import com.project.ohmycat.entity.Like;
import com.project.ohmycat.repository.BoardRepository;
import com.project.ohmycat.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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


    @Transactional
    public Integer countByLikeBrdKey(Integer likeBrdKey, Integer likeBy) {
        if (likeRepository.countByLikeBrdKeyAndLikeBy(likeBrdKey, likeBy) > 0) {
            likeRepository.deleteByLikeBrdKeyAndLikeBy(likeBrdKey,likeBy);
        } else {
            Like like2 = Like.builder()
                    .likeBy(likeBy)
                    .likeBrdKey(likeBrdKey)
                    .build();
            likeRepository.save(like2);
        }
        System.out.println(likeRepository.countByLikeBrdKey(likeBrdKey));

        return likeRepository.countByLikeBrdKey(likeBrdKey);
    }
}


