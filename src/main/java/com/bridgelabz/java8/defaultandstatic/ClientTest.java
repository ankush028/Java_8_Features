package com.bridgelabz.java8.defaultandstatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientTest {
    public static void main(String[] args) {
        MyInterface inter = new MyClass();
        Student s = new Student("Ankush",21);
        Student s1 = new Student("Rohit",22);
        Student s2 = new Student("mayuresh",23);
        List<Student> list =  Arrays.asList(s,s1,s2);
        inter.sortStudents(list).forEach(System.out::println);
        //list.forEach(System.out::println);



    }

}
