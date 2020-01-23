package com.bridgelabz.java8.functionfunctionalinterface;

import java.util.function.Function;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String customShow(Function<Student,String> function){
        return function.apply(this);
    }

}
