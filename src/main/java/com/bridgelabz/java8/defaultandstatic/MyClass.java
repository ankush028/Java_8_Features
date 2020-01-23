package com.bridgelabz.java8.defaultandstatic;

import java.util.List;

public class MyClass implements MyInterface{



    @Override
    public int maximum(List<Integer> intList) {
        intList.add(10);
        return intList.get(0);
    }

}
