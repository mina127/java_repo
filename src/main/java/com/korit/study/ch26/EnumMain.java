package com.korit.study.ch26;
//enumerated -> 열거, 나열

enum Name{
    준일, 준이, 준삼
}
enum Name2{
    N1("준일"), N2("준이"), N3("준삼");
    private final String name;
    Name2(String name){
        this.name = name;
    }


}
enum Writer{
    W1("김준일",32) ,  W2("김준이",33), W3("김준삼",34);
    private final String fullname;
    private final Integer age;

    Writer(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getAge() {
        return age;
    }
}
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);
        System.out.println();
        System.out.println(Writer.W1.getFullname());
        System.out.println(Writer.W1.getAge());
        Writer writer = Writer.W1;
    }
}
