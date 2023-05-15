package com.project.ohmycat.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment extends BasicEntity {

    @Id
    @Column(name = "com_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comKey;

    @Column(name = "com_content", nullable = false)
    private String comContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "com_board_key", referencedColumnName = "board_key", columnDefinition = "UNSIGNED INT(11)")
    private Board board;

    @Builder
    public Comment(String comContent, Board board) {
        this.comContent = comContent;
        this.board = board;
    }

}
