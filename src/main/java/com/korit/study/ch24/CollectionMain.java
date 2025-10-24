package com.korit.study.ch24;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 문자열을 담을 수 있는 ArrayList 생성;

        // 값 추가
        list.add("문자열 값`1");
        list.add("문자열 값`2");

        // 값을 가져오기
        String str1 = list.get(0);
        String str2 = list.get(1);

        // 값을 수정
        String str3 = list.set(1, "문자열 값3");
        System.out.println(str3);

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        System.out.println(list.contains("20"));
        //list안에서 값이 위치하고 있는 index를 찾기
        int indexOf30 = list.indexOf("30");
        System.out.println(indexOf30);
        //리스트 자르기
        List<String> subList = list.subList(list.indexOf("30"), list.size());
        subList.indexOf("30");
        subList.indexOf("40");
        System.out.println(subList);

        //중간에 위치하고 있는 데이터 30의 index를 찾는 방법

        int start = list.indexOf("30") + 1;
        indexOf30 = -1;
        for (int i = 0; i< list.size(); i++){
            if(list.get(i).equals("30")){
                indexOf30 = i;
                break;
            }
        }
        subList.indexOf("30");
        subList.add("40");
        System.out.println(subList);
        LinkedList<String> linkedList = new LinkedList<>(); // 노드형식으로 앞 뒤가 이어져있다?? 어디로 가는지 알 수 있음.

        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");

        // Set (집합)
        Set<String> strSet = new HashSet<>();
        //값 추가
        strSet.add("나");
        strSet.add("가");
        strSet.add("다");
        System.out.println(strSet);

        //값 조회
        String r1 = null;
        String setSearchValue = "다";
        for (String s : strSet){
            if(s.equals(setSearchValue)){
                r1 = s;
                break;
            }
        }
        System.out.println(r1);
        if(strSet.contains(setSearchValue)){
            r1 = setSearchValue;
        }
        System.out.println(r1);
        //값 수정 (remove -> add)
        strSet.remove("나");
        System.out.println(strSet);
        strSet.remove("다");
        System.out.println(strSet);
        strSet.add("아");
        System.out.println(strSet);
        Set<String> c = new HashSet<>();



        // Map (키 + 값 쌍 -> 집합)
        Map<String, String> strMap = new HashMap<>();
        // 값 추가
        strMap.put("a","김준일");
        strMap.put("b","김준이");
        strMap.put("c","김준삼");
        strMap.put("d","김준사");
        strMap.put("d","김준오");
        System.out.println(strMap);
        String mapV = strMap.get("c");
        System.out.println(mapV);
        String mapV2 = strMap.getOrDefault("g","기본값");
        System.out.println(mapV2);

        //값 수정
        strMap.put("a","김준육");
        System.out.println(strMap);
        //값 삭제


        System.out.println(strMap.remove("a"));

        System.out.println(strMap.remove("b","김준육"));
        System.out.println(strMap.remove("b","김준이"));
        System.out.println(strMap);
        System.out.println(strMap.entrySet());//중괄호
        //자바에선 중괄호가 아니면 반복을 돌릴 수 없다.


        //Map을 반복 작업하는 방법 : Map 자료형을 Entry가 들어있는 Set자료형으로 형변환
        for(Map.Entry<String , String> entry : strMap.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+":"+value);
        }
        Set<String> value = new HashSet<>();
        value.addAll(strMap.values());
        strMap.keySet();
        // 앞으로 중괄호 열면 map
        //대괄호 열면 list





    }

}
