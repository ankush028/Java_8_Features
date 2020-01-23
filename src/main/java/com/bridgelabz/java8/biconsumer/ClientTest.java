package com.bridgelabz.java8.biconsumer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ClientTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ankush");
        map.put(2,"Mayuresh");
        map.put(3,"Rohit");
        map.put(4,"Sachin");
        BiConsumer<Integer,String> biConsumer = (k,v)-> System.out.println("Key "+k+" Value  -> "+v);
        map.forEach(biConsumer);
        Map<Integer,Student> studMap = new HashMap<>();
        studMap.put(1,new Student("Ankush",9069057147L));
        studMap.put(2,new Student("Rohit",89357147L));
        studMap.put(3,new Student("Mayuresh",885057147L));
        studMap.put(4,new Student("Sachin",7358057147L));
        studMap.forEach((k,v)-> System.out.println("/n"+k+v));
    }
}
