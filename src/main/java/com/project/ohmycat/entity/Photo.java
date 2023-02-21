package com.project.ohmycat.entity;

import lombok.Cleanup;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "photo")
public class Photo extends BasicEntity{

    @Id
    @Column(name = "photo_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PhotoKey;

    @Column(name = "photo_route", nullable = false)
    private String PhotoRoute;

    @Column(name = "photo_name", nullable = false)
    private String PhotoName;

    @Column(name = "photo_type", nullable = false)
    private String PhotoType;

}
