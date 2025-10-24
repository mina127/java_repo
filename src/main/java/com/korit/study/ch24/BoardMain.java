package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain {
    public static void main(String[] args) {
        //게시판
        List<Map<String, Object>> ge = new ArrayList<>();
        // 작성자
        Map<String, Object> str1 = new HashMap<>();
        str1.put("name","김준일");
        str1.put("age",32);
        //


        //게시글
        Map<String, Object> str1_1 = new HashMap<>();
        str1_1.put("title","게시판 제목1");
        str1_1.put("Writer",str1);
        str1_1.put("content","게시판 내용1");


        // 댓글들
        List<Map<String, String>> comments = new ArrayList<>();

        Map<String,String> llistMap1 = new HashMap<>();
        llistMap1.put("writer","김준이");
        llistMap1.put("content","댓글내용1");


        Map<String,String> llistMap2 = new HashMap<>();
        llistMap2.put("writer","김준삼");
        llistMap2.put("content","댓글내용2");
        comments.add(llistMap1);
        comments.add(llistMap2);




//        llist.add(llistMap1.toString());
//        llist.add(llistMap2.toString());
        Map<String, Object> str2 = new HashMap<>();
        str2.put("name","김준사");
        str2.put("age",34);
        //


        //게시글
        Map<String, Object> str2_1 = new HashMap<>();
        str2_1.put("title","게시판 제목2");
        str2_1.put("Writer", str2);
        str2_1.put("content","게시판 내용2");


        // 댓글들
        List<Map<String, String>> comm = new ArrayList<>();

        Map<String,String> llistMp1 = new HashMap<>();
        llistMp1.put("writer","김준오");
        llistMp1.put("content","댓글내용11");


        Map<String,String> llistMp2 = new HashMap<>();
        llistMp2.put("writer","김준육");
        llistMp2.put("content","댓글내용22");
        comm.add(llistMp1);
        comm.add(llistMp2);




//        llist.add(llistMap1.toString());
//        llist.add(llistMap2.toString());


        str2_1.put("Comments", comm);




        str1_1.put("Comments",comments);

        ge.add(str1_1);
        ge.add(str2_1);
        System.out.println(ge);



    }
}
