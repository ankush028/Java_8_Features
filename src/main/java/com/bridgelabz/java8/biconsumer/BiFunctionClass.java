package com.bridgelabz.java8.biconsumer;

import java.util.function.BiFunction;

public class BiFunctionClass {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> biFunction = (str1,str2)-> "Result is "+str1+str2;
        System.out.println(biFunction.apply(10,20));
    }
}
