package com.korit.study.ch27;

public class InnerClassMain {
    public static void main(String[] args) {
        User user = new User("Test1","1234");
        System.out.println(user);

        User.Userprinter2 userprinter = new User.new Userprinter2(user.toString());
        userprinter.print();

    }


}

