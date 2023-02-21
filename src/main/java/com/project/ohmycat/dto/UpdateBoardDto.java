package com.project.ohmycat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBoardDto {

    private Integer boardKey;
    private String boardTitle;
    private String boardContent;
}
