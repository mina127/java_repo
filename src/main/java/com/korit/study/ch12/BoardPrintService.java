package com.korit.study.ch12;

public class BoardPrintService {

    void printAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
//        for (int i = 0; i < boards.length; i++) {
//            Board board = boards[i];
//            System.out.println("게시글 ID: " + board.id);
//            System.out.println("게시글 제목: " + board.title);
//            System.out.println("게시글 내용: " + board.contents);
//            System.out.println("게시글 작성자 ID: " + board.writer.id);
//            System.out.println("게시글 작성자 이름: " + board.writer.name);
//            for (int j = 0; j < board.comments.length; j++) {
//                Comment comment = board.comments[j];
//                System.out.println("댓글 ID: " + comment.id);
//                System.out.println("댓글 내용: " + comment.contents);
//                System.out.println("댓글 작성자 ID: " + comment.writer.id);
//                System.out.println("댓글 작성자 이름: " + comment.writer.name);
//            }
//            System.out.println();
//        }

        for (Board board : boards) {
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();
        }
    }

}
