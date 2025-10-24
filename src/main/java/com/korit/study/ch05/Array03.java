package com.korit.study.ch05;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] nums2 = new int[3];

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i];
        }

        System.out.print("[");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + (i < nums2.length - 1 ? ", " : ""));
        }
        System.out.print("]");
    }
}
