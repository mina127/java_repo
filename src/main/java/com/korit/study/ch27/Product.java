package com.korit.study.ch27;

public class Product {
    private String name;
    private Integer price;
    private String size;




    public Product build(){
        return new Product(name,price,size);
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public static productBuilder builder(){
        return new productBuilder();
    }
    public static class productBuilder{

    }


    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
