package com.bridgelabz.java8.biconsumer;

import java.util.StringJoiner;

public class Student {
    private String name;
    private long mbno;

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("mbno=" + mbno)
                .toString();
    }

    public Student(String name, long mbno) {
        this.name = name;
        this.mbno = mbno;
    }
}
