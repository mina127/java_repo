package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousClassMain {
    static void main() {
        AnonymousClass a = new AnonymousClassImpl();
        a.fx1();
        System.out.println(a.fx2());
        int n = 10;
        AtomicInteger n2 = new AtomicInteger(10);

        AnonymousClass b = new AnonymousClass(){
            @Override
            public void fx1() {
                System.out.println(n);
                n2.set(n2.get() + 10);
            }
            @Override
            public int fx2() {
                return 0;
            }
        };

    }

}
