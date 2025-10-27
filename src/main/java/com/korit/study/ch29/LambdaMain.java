package com.korit.study.ch29;
/*
lambda - 익명함수
1. 하나의 추상 메서드를 가진 인터페이스를 정의
2. 생성자 호출 부분이 생략된다. new 키워드를 하지않고 생성함.
3. 매개변수의 자료형을 생략하여 재정의 할 수 있다.
4.매개변수가 하나면 () 소괄호를 생략할 수 있다.
5. 리턴 자료형을 명시하지 않아도 된다.

6. 실행할 명령문이 한줄이면 {} 중괄호를 생량할 수 있다.
    이때 리턴값이 있는경우 리턴 키워드도 같이 생략하여야한다.
    중괄호와 return 키워드는 세트.
6.

 */
public class LambdaMain {
    static void main() {
        LambdaStudy s1 = new LambdaStudy() {
            @Override
            public int calculate(int a, int b, int c) {
                System.out.println("익명클래스 사용");
                return a * b - c;
            }
        };
        System.out.println(s1.calculate(10,5,2));
       // 생성자 호출 부분 -> 기호로 대체

        LambdaStudy s2 = (int a, int b, int c) -> {
           System.out.println("lambda");
           return a * b - c;
       };


        System.out.println(s2.calculate(10,5,2));
    // 매개변수 자료형 생략 가능
    // 람다가 아니더라도 오버라이드 (재정의)는 매개변수명도 변경가능
    LambdaStudy s3 = (a,b,c) -> {
        System.out.println("lambda");
        return a * b - c;
    };
    //실행문이 하나면 함수 내용을 감싸는 {} 중괄호 생략가능
        LambdaStudy2 s4 = num -> System.out.println(num);
    s4.calculate(100);


    }
    //실행문이 하나인데 리턴 값이면 {} 중괄호오ㅏ return 키워드 생략가능
    int n1 = 10;
    int n2 = 30;
    //LambdaStudy3 s5 = () -> n1 * n2;

}
