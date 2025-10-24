package com.korit.study.ch23;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] e = {a, b, c, d};
        for (NonGeneric n : e){
            System.out.println(n.getData().getClass());
            if(n.getData() instanceof String data){
                System.out.println(data);
            } else if (n.getData() instanceof  NonGeneric data){
                System.out.println(data.getData());
            }
        }
        Generic <String , Integer>dd = new Generic<>("문자열 데이터","",3.14,10);


    }
}
