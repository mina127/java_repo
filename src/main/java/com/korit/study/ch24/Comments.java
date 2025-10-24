package com.korit.study.ch24;

public class Comments {
    private String name;
    private String content;

    public Comments(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
