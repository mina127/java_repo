package com.korit.study.ch06;

public class 연습문제2 {

    public static void main(String[] args) {
        printInfo("김준일", 32, "부경대");
        printInfo("김준일", 32);
        printInfo("김준일");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(double a, double b) {
        return (int) (a + b);
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이: " + age);
    }

    public static void printInfo(String name, int age, String school) {
        printInfo(name, age);
        System.out.println("학교: " + school);
    }

}
