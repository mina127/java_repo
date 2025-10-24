package com.korit.study.ch24;


import java.util.ArrayList;
import java.util.List;

public class BoardMain2 {
    static void main() {
        List<Board2> boards = new ArrayList<>();
        boards.add(new Board2());
        boards.add(new Board2());
        boards.get(0).setTitle("게시판 제목 1");
        boards.get(0).setWriter(new Writer("김준일",32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment("댓글내용1", new Writer("김준이",31)));
        boards.get(0).getComments().add(new Comment("댓글내용1", new Writer("김준삼",31)));

        Board2 board = new Board2();
        List<Comment> comments = new ArrayList<>();
        board.setTitle("게시판 제목1");
        board.setWriter(new Writer("김준사",32));
        board.setContent("게시판 내용2");
        comments.add(new Comment("댓글내용1",new Writer("김준오",35)));
        comments.add(new Comment("댓글내용2",new Writer("김준육",35)));
        board.setComments(comments);
        boards.add(board);
        boards.add(new Board2());

        Board2 board2 = new Board2("게시판 제목2",new Writer("김준사",34),"게시판내용2",comments);
        System.out.println(boards);

    }
}
