package com.korit.study.ch27;

public class BuilderMain {
    static void main() {
        BuilderStudy builderStudy = new BuilderStudy("김준일",32);
        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value1("김준일")
                .build();
        Product product = Product.builder.name("상품").price(1000).size("L").build();
        System.out.println(product);

    }
}
