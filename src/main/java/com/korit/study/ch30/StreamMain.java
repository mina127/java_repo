package com.korit.study.ch30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
stream(흐름)
1. 생성        - 스트림 객체 생성
2. 중간 연산    - 변환 , 필터링 (반복작업)
3. 최종연산     - 결과도출 (반복)

 */
public class StreamMain {
    static void main() {
        Stream<String> stream6 = Map.of("a","1","b","2","c","3").keySet().stream();
        Stream<String> stream7 = Map.of("a","1","b","2","c","3").values().stream();
        Stream<Map.Entry<String, String>> stream8 = Map.of("a","1","b","2","c","3").entrySet().stream();

        List<String>names = List.of("김준일","김준이");
        List<String> lastNames = new ArrayList<>();
        for(String name : names) {
            String lastName = name.substring(0,1);
            lastNames.add(lastName);
        }
        lastNames.forEach(System.out::println);

        //배열또는 컬렉션을 stream으로 변환하여 생성
        names.stream()
                .map(name -> name.substring(0,1)).collect(Collectors.toList() )//여기까지가 stream
                .forEach(System.out::println);

        //중간연산 map(), filter ()
        //1. map() 변환, 치환 할 때 사용


        List<String> strNums = List.of("10","20","30");


        List<Integer> nums = StreamMap.map(strNums,strNum -> Integer.parseInt(strNum) * 10);
        //2.filter() 분류
        List<Integer> odds = nums.stream().filter(num -> num % 2 != 0)
                .toList();
        System.out.println(odds);



    }
    class StreamMap{
        public static <T,R> List<R> map (List<T> list,Function <T,R> action){
            Objects.requireNonNull(list);
            Objects.requireNonNull(action);//널이 아닌것이 필수
            if(Objects.isNull(list)){
                return null;
            }//널체크
            if(list.isEmpty()){
                return null;
            }//null 체크
            List<R> rList = new ArrayList<>();// R -> Integer, T -> String
            for(T t : list){
                rList.add(action.apply(t));
            }
            return rList;
        }

    }
}
