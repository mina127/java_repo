package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {


        // 2 < n < 100 반복
        // 4의 배수이면 출력

        for (int i = 3; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

//        int i = 0;
//
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        for (int i = 0; i < 20; i++) {
            int n = i + 1;

            System.out.printf("%,d = %s\n", n , n % 2 == 0 ? "짝" : "홀");

            if (n % 2 == 0) {
                System.out.println(n + " = 짝");
                continue;
            }
            System.out.println(n + " = 홀");

            if (n % 2 == 0) {
                System.out.println(n + " = 짝");
            } else {
                System.out.println(n + " = 홀");
            }
        }

    }
}
