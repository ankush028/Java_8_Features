package com.bridgelabz.java8.functionfunctionalinterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorOperation {

    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(2,4,5,6,78,9);
      UnaryOperator<Integer> unaryOpt = i->i*i;
       unaryOperatorFun(unaryOpt,list).forEach(x-> System.out.println(x));

    }

    private static List<Integer> unaryOperatorFun(UnaryOperator unaryOpt, List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i->uniList.add((Integer) unaryOpt.apply(i)));
        return uniList;
    }

}
