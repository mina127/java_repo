package com.korit.study.ch23;

public class NonGeneric {
    private Object data;
    //타입을 유동적으로 변환하기 위해 Object 타입으로 정의
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NonGeneric{" +
                "data='" + data + '\'' +
                '}';
    }

    public NonGeneric(Object data) {
        this.data = data;
    }
}
