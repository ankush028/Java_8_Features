package com.bridgelabz.java8.biconsumer;

import java.util.function.BiConsumer;

public class AndThen {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> adder = (I1,I2)-> System.out.println("Adder :"+(I1+I2));
        BiConsumer<Integer,Integer> multiplier = (I1,I2)-> System.out.println("Multiplier :"+(I1*I2));
        BiConsumer<Integer,Integer> subtract = (I1,I2)-> System.out.println("Subtract :"+(I1-I2));

        adder.andThen(multiplier).andThen(subtract).accept(40,10);

    }
}
