package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    static void main() {
        Button button = new Button();
        ClickKistener clickKistener = new ClickKistener() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭하였습ㄴ디ㅏ.");
            }
        };
        button.setListener(clickKistener);

        button.click();
        int x = 10;
        int y = 5;

        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        Calculator subtract = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + subtract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));

    }
}
