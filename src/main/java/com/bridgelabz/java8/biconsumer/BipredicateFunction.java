package com.bridgelabz.java8.biconsumer;

import java.util.function.BiPredicate;

public class BipredicateFunction {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate = (i,o)->i>20&&o.startsWith("A");
        System.out.println(biPredicate.test(30,"Ankush"));
    }
}
