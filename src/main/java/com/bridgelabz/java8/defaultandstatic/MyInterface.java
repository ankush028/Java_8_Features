package com.bridgelabz.java8.defaultandstatic;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

    default public List<Student> sortStudents(List<Student> students){
        Collections.sort(students);
        greet("Checking");
        return  students;
    }

     static void greet(String name){
        System.out.println("Welcome :"+name);
    }

    int maximum(List<Integer> intList);
}
