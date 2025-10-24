package com.korit.study.ch20;

public class Factory {
    private String name;
    private static int j = 1;


    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }

    public Factory(String name) {
        this.name = name;
    }

    public Product createProduct(String name){

        return new Product(j++,name);

    }
}
