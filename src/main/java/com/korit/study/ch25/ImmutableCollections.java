package com.korit.study.ch25;

import com.korit.study.ch24.Board2;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> iList = List.of("김준일","김준이");
        iList.add("김준삼");
        Map<String,List<String>> iMap = Map.of(
                "k1",List.of("김준일","김준이"),
                "k2",List.of("김준삼","김준사"),
                "k3",List.of("김준오","김준육"),
                "k4",List.of("김준칠","김준팔")
        );
        List<Board2> boards = new ArrayList<>();
        boards.add(new Board2("제목1",
                new Writer("김준일",32),
                "내용1",
                List.of(
                        new Comment(
                                "댓글1", new Writer("songmina",23)
                                                ),
                        new Comment("댓글2", new Writer("min",33)))

                )
                );
    }
}
