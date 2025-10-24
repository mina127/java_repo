package com.korit.study.ch24;

import java.util.List;
import java.util.Objects;



public class Board2 {
    private String title;
    private Writer writer;
    private String content;
    private List<Comment> comments;

    public Board2(String title, Writer writer, String content, List<Comment> comments) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comments = comments;
    }
    public Board2(String title, Writer writer, String content) {

    }

    public Board2() {

    }

    @Override
    public String toString() {
        return "Board2{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Board2 board2)) return false;
        return Objects.equals(title, board2.title) && Objects.equals(writer, board2.writer) && Objects.equals(content, board2.content) && Objects.equals(comments, board2.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writer, content, comments);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
