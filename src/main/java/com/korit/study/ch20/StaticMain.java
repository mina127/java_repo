package com.korit.study.ch20;

import com.korit.study.ch01.Casting;

public class StaticMain {
    public static void main(String[] args) {
        StaticStudy staticStudy = new StaticStudy();
        staticStudy.print("songmina");
        Casting.main(null);
        staticStudy.age = 10;
        StaticStudy.age2=30;
        System.out.println(staticStudy.age);
        System.out.println(StaticStudy.age2);

    }
}
