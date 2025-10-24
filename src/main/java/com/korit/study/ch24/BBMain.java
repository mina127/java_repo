package com.korit.study.ch24;


import jdk.jfr.ContentType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BBMain {
    public static void main(String[] args) {
        User user1 = new User("김준일",32);
        User user2 = new User("김준사",34);

        Comments c1 = new Comments("김준이","댓글내용1");
        Comments c2 = new Comments("김준삼","댓글내용2");
        List<Comments> cc = new ArrayList<>();
        cc.add(c1);
        cc.add(c2);


        Comments c3 = new Comments("김준오","댓글내용11");
        Comments c4 = new Comments("김준육","댓글내용22");
        List<Comments> vv = new ArrayList<>();
        vv.add(c3);
        vv.add(c4);
        Board b1 = new Board("게시판 제목1",user1,"게시판 내용1",cc);
        Board b2 = new Board("게시판 제목 2",user2,"게시판 내용2",vv);
        System.out.println(b1.toString());




    }
}
