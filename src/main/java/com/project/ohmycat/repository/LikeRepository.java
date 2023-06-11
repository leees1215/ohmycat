package com.project.ohmycat.repository;

import com.project.ohmycat.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {

//    @Query("SELECT COUNT(l) FROM likeBrd l WHERE l.likeBrdKey = :likeBrdKey AND l.likeBy = :likeBy")
    Integer countByLikeBrdKeyAndLikeBy(Integer likeBrdKey, Integer likeBy);
}
