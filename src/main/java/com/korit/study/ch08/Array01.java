package com.korit.study.ch08;

import javax.xml.parsers.SAXParser;
import java.util.Random;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // 묶어 놓고 반복을 통해 순서대로 데이터를 사용하려고
        int[] a = new int[3];
        double[] b = new double[3];
        boolean[] c = new boolean[3];
        String[] d = new String[3];
        Scanner[] e = new Scanner[3];
        Random[] f = new Random[3];

        int a2 = 10;
        double b2 = 10.5;
        boolean c2 = true;
        String d2 = "";
        Scanner e2 = new Scanner(System.in);
        Random f2 = new Random();

        System.out.println(c[0]);


    }
}
