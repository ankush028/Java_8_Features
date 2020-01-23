package com.bridgelabz.java8.functionfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ankush",21));
        list.add(new Student("Ankit",22));
        list.add(new Student("Mayuresh",23));

        for (Student stud:list){
            System.out.println(stud.customShow(s->s.getName()+"/t"+s.getAge()));
        }

        Function<Student,String> styleOne= s->{
            String result = "Name :"+s.getName()+"And Age : "+s.getAge();
             return result;
        };

    }
}
