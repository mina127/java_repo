package com.korit.study.ch29;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaInterface {
    static void main() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };
        r.run();
        Runnable r2 = () ->{
            System.out.println("runnable 인터페이스");
        };
        r2.run();
        Consumer<String> stringConsumer  = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s:" + s);
            }
        };
        stringConsumer.accept("consumer");
        Consumer<String> stringConsumer2  = s -> {
            System.out.println("consumer 인터페이스");
            System.out.println("매개변수 s:" + s);
        };
        stringConsumer2.accept("consumer");

        Consumer<Integer> andThenStudy = num -> {
            System.out.println(num);
        };
        andThenStudy.andThen(num2 ->{
            System.out.println(num2);
        });
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println(num2);
        });
        //andthen안에서 호출 호출결과를 andThenStudy2에 담는다.
        Consumer<Double> doubleConsumer = d ->{
            System.out.println("1");
            System.out.println("숫자:" + d);

        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자:" + d);
        }).andThen( d ->{
                    System.out.println("3");
                    System.out.println("숫자:" + d);
                }
                ).andThen( d ->{
            System.out.println("4");
            System.out.println("숫자:" + d);
        }).accept(3.14);// 하나의 accept 값을 가지고 순서대로 동작하기 위해서 사용

        //하나의 값으로 하나씩 실행가능

        //forEach()
        List<String> nameList = List.of("김준일","김준이");
        nameList.forEach(n-> System.out.println(n));
        nameList.forEach(System.out::println); // 더블콜론 -> 람다의 메서드 참조



        //3. 매개변수 x,리턴 o
        String str = null;
        Supplier<Boolean> boolSupplier = () -> Objects.isNull(str);
        System.out.println(boolSupplier.get());
        //리턴을 할때 str 가져다 씀 (외부에서 가져다씀)



        //4. 매개변수 o, 리턴 o
        Function<Integer,String> function = num -> {
            System.out.println("정수받아서 문자열로 리턴");
        return num.toString(num);};
        String functionResult = function.apply(10);
        System.out.println(functionResult);
        function.andThen(num -> "num2:" + num).apply(20);
        System.out.println(functionResult);


        System.out.println("**************************************");

        String searchUsername = "test1234";
        Predicate<List<Map<String,String>>> listPredicate = list -> {
            AtomicBoolean isFound =new AtomicBoolean(false);
            list.forEach(map -> {
                if(map.get("username").equals(searchUsername)){}
                isFound.set(true);
            });
            return isFound.get();
        };
        List<Map<String, String>> userList = List.of(
                Map.of("username","test1","password","1111"),
                Map.of("username","test13","password","1221"),
                Map.of("username","test14","password","1331"),
                Map.of("username","test12","password","1441")
        );
        System.out.println(listPredicate.test(userList));
        String startedLastName ="이";
        List<String> names = List.of("김준일","김준이","이준일","이준이");
        List<String> filteringNames = names.stream().filter(name -> name.startsWith(startedLastName))
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(filteringNames);


        String foundName = names.stream().filter(name -> name.equals("김준이")).collect(Collectors.toList()).getFirst();
        System.out.println(foundName);

        //매개변수 o, return o,둘의 자료형이 동일하면
        UnaryOperator<String> f1 = s-> s + "문자열";
        Function<String, String> f2 = s-> s + "문자열";
        BiFunction<String, String,String> f3 = (s1,s2)-> s1 + s2;
        BinaryOperator<String> f4 = (s1,s2)-> s1 + s2;
    }







}
