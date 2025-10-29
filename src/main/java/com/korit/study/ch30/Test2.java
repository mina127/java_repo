package com.korit.study.ch30;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item1 {
    String name;
    int stock;
    boolean onSale;
    int price;

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    @Override
    public String toString() {
        return "Item1{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", onSale=" + onSale +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public Item1(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }
    // constructor, getters
}
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

        List<Item1> items = Arrays.asList(
                new Item1("노트북", 5, true, 1000000),
                new Item1("마우스", 0, true, 30000),
                new Item1("키보드", 10, false, 50000),
                new Item1("헤드셋", 3, true, 80000),
                new Item1("웹캠", 0, false, 60000)
        );
        List<String> dd = items.stream()
                .filter(s-> s.stock >= 1 && s.onSale).map(
                        s->s.name).toList();


        System.out.println(dd);

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);
        List<Integer> s23 = numbers5.stream().filter(
                s-> numbers5.stream().filter(
                        s2-> s2 == s).count() == 1).toList();
        System.out.println(s23);
        // 해설 : 처음 stream 이랑 필터로 반복 그리고 안에 또 stream filter사용해서 숫자가 하나만 있는것만 걸러내서 list
        // for문 버전

        List<Integer>filterN = new ArrayList<>();
        for (Integer i : numbers5){
            int c = 0;

            for(Integer j : numbers5){
                if(j == i) c++;

            }
            if(c == 1) filterN.add(i);
        }
        System.out.println(filterN);

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );
        System.out.println(LocalDate.of(2024,1,1).getDayOfWeek());
        List<LocalDate> filteringDates = dates.stream().filter(
                localDate-> localDate.getDayOfWeek() == DayOfWeek.SATURDAY ||
                        localDate.getDayOfWeek() == DayOfWeek.MONDAY
        ).toList();
        System.out.println(filteringDates);






    }
}
