package com.korit.study.ch24;

import java.util.Objects;

public class Comment {
    private Writer writer;
    private String content;

    public Comment(String content, Writer writer) {
        this.content = content;
        this.writer = writer;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comment comment)) return false;
        return Objects.equals(writer, comment.writer) && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, content);
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
}
