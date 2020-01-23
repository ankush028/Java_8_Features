package com.bridgelabz.java8.supplierinterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierTest {
    public static void main(String[] args) {
        BooleanSupplier bs = ()->true;
        System.out.println(bs.getAsBoolean());
        int x= 100;
        int y =70;

        bs =()->y>x;
        System.out.println(bs.getAsBoolean());
    }


}
