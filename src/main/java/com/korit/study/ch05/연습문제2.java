package com.korit.study.ch05;

public class 연습문제2 {
    public static void main(String[] args) {
        int[] nums = { 5, 10, 15, 20, 25 };
        int result = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
        System.out.println("배열 요소들의 합: " + result);

        int result2 = 0;
//        result2 = result2 + nums[0];
//        result2 = result2 + nums[1];
//        result2 = result2 + nums[2];
//        result2 = result2 + nums[3];
//        result2 = result2 + nums[4];

        for (int i = 0; i < 5; i++) {
            result2 = result2 + nums[i];
            if (i % 2 == 0) {
                System.out.println("배열 요소들의 합: " + result2);
            }
        }

    }
}
