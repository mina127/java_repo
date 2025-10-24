package com.korit.study.ch24;

import java.util.Objects;

public class Writer {

        private  String name;
        private int age;

        public Writer(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Writer{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Writer() {

    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Writer writer)) return false;
        return age == writer.age && Objects.equals(name, writer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
