package com.korit.study.ch24;



import java.util.ArrayList;
import java.util.List;

public class Board {
    String title;
    private User writer;
    private String content;

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }

    private List<Comments> comments;

    public Board(String title,User writer, String content, List<Comments> comments) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comments = comments;
    }
}
