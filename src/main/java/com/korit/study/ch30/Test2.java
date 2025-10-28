package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
class Person1 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
// constructor, getters
}
class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

// constructor, getters
}

public class Test2 {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> nn = numbers.stream().filter(s-> s % 2 == 0).toList();
        System.out.println(nn);

        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> ww = words.stream().filter(s-> s.length() > 4).toList();
        System.out.println(ww);

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> nnn = names.stream().filter(s-> s.charAt(0) == 'A').toList();
        System.out.println(nnn);

        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        List<Integer> mm = mixedNumbers.stream().filter(s-> s >=0 ).toList();
        System.out.println(mm);
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );
        List<String> p = products.stream().filter(s-> s.getPrice() >= 50000 && s.getPrice() <=500000 ).map(
                s-> s.getName()
        ).toList();
        System.out.println(p);



        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );
        List<String> n = emails.stream().filter(s-> s.contains("gmail.com")).toList();
        System.out.println(n);

        List<Person> people = Arrays.asList(
                new Person("김철수", 25),
                new Person("이영희", 17),
                new Person("박민수", 30),
                new Person("정지원", 16),
                new Person("최수현", 22)
        );
        List<String> people2 = people.stream()
                .filter(s-> s.getAge() >= 20)
                .map(s-> s.getName() + "(" + s.getAge() +")")
                .toList();
        System.out.println(people2);


    }
}
