package com.project.ohmycat.entity;

import com.project.ohmycat.dto.InsertBoardDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "board")
@NoArgsConstructor
@Getter
@Setter
public class Board extends BasicEntity {

    @Id
    @Column(name = "board_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardKey;

    @Column(name = "board_title", nullable = false)
    private String boardTitle;

    @Column(name = "board_content", nullable = false)
    private String boardContent;

    @Column(name = "board_by", nullable = false)
    private Integer boardBy;

    @Builder
    public Board(InsertBoardDto dto, Integer boardBy) {
        this.boardTitle = dto.getBoardTitle();
        this.boardContent = dto.getBoardContent();
        this.boardBy = boardBy;
    }

    public void updateBoard(Integer boardKey, String boardTitle, String boardContent) {
        this.boardKey = boardKey;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }
}
