package com.korit.study.ch19;

public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        Object c = a;
        Object d = b;
        Object e = "test";

        String f = "abc";
        Car car = new Car("k3","화이트");
        Object g = car;
        //System.out.println(c+d);
        String name1 = "김준일";
        String name2 = "송민아";
        boolean result1 = name2 == name1;
        String name3 =new String("송민아");

    }
}
