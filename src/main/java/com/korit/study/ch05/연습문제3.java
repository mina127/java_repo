package com.korit.study.ch05;

public class 연습문제3 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 12, 67, 34, 89, 11};

        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        max = 0;
        for (int i = 0; i < 7; i++) {
            max = nums[i] > max ? nums[i] : max;
        }
    }
}
