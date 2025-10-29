package com.korit.study.ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Item {
    String name;
    int price;


    //

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // constructor, getters
}
class Student {
    String name;
    int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    // constructor, getters
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // constructor, getters
}


public class Test {
    public static void main(String[] args) {

        List<String> asList = new ArrayList<>();
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> names2 = names.stream()
                .map(s -> s.toUpperCase(Locale.ROOT) )
                .collect(Collectors.toList());
        System.out.println(names2);




        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> i = numbers.stream().map(s-> s * s).collect(Collectors.toList());
        System.out.println(i);



        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> ist3 = words.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(ist3);




        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> ist4 = prices.stream().map(s -> s + (s/10)).collect(Collectors.toList());
        System.out.println(ist4);




        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> ist5 = usernames.stream().map(s-> "user: " + s).collect(Collectors.toList());
        System.out.println(ist5);



        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        List<String> pp = people.stream().map(s-> s.getName()).collect(Collectors.toList());
        System.out.println(pp);




        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );
        List<EmployeeDTO> ist7 = employees.stream()
                .map(s-> new EmployeeDTO(
                        "Mr.Ms/: " + s.getName() , "Salary:" + s.getSalary())
                ) .collect(Collectors.toList());

        System.out.println(ist7);
        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");
        List<String> ccc = cities.stream().map(s-> s.toUpperCase(Locale.ROOT).substring(0,1)).collect(Collectors.toList());
        System.out.println(ccc);

        List<Boolean> flags = Arrays.asList(true, false, true, true, false);
        List<Boolean> fff = flags.stream().map(s-> s.equals(false)).collect(Collectors.toList());
        System.out.println(fff);

        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
        List<Double> cel = celsius.stream().map(s-> (s * 9/5) + 32).toList();
        System.out.println(cel);

        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");
        List<String> mm = messyData.stream().map(s->s.trim()).toList();
        System.out.println(mm);

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );
        List<String> mail = emails.stream().map(s -> s.substring(s.indexOf("@")+1)).toList();
        System.out.println(mail);

        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;
        List<Integer> yy = ages.stream().map(s-> currentYear - s).toList();
        System.out.println(yy);

        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );
        List<String> ttt = items.stream().map(s-> s.getName() + "(" + s.price+"원)").toList();
        System.out.println(ttt);

        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );
        List<String> ss = students.stream().map(s->s.score >= 90 ? s.name + ":" + "A" : s.score >= 80 ?
                s.name + ":" + "B" : s.score >= 70 ? s.name + ":" + "C" : s.name + ":" + "D").toList();
        System.out.println(ss);

        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );

        List<String> fd = filePaths.stream()
                .map(s-> s.contains("/") ? s.substring(s.lastIndexOf("/")) : s.substring(s.lastIndexOf("\\")))
                .toList();
        System.out.println(fd);
        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );
        List<String> ph = phoneNumbers.stream().map(s -> s.substring(0,3) + "-" + s.substring(3,7) +"-" + s.substring(7)).toList();
        System.out.println(ph);





    }
}
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
// constructor, getters
}

class EmployeeDTO {
    String displayName;
    String salaryInfo;

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }

    // constructor, getters



}
