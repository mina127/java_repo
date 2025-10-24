package com.korit.study.ch19;

import java.util.Objects;

public class Car2 extends Object{
    private String model ;
    private String color;

    public Car2(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public boolean equals(Object o){
        if(o.getClass() != Car2.class){// 오브젝트 인스턴스를 생성한 클래스의 객체가 뒤에 클래스로 만들어 진지 확인
            return false;
        }
        Car2 car = (Car2) o;
        return Objects.equals(model,car.model) && Objects.equals(color,car.color);
    }



}
