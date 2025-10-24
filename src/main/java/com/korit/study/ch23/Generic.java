package com.korit.study.ch23;

public class Generic<T,T2> {
    //제네릭은 무조건 참조 자료형만 사용간으


    private T data;
    private T data2;

    private double data3;
    private T2 data4;


    public Generic(T data, T data2, double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;

    }

    public Generic(String 문자열_데이터, String s, double v, int i) {
    }
}
