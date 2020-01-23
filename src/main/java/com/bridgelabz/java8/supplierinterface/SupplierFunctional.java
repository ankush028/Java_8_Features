package com.bridgelabz.java8.supplierinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctional {
    public static void main(String[] args) {
        Supplier<Integer> supplier = SupplierFunctional::getNum;
        for (int i=1;i<=21;i++){
            System.out.println(supplier.get());
        }

    }

    private static Integer getNum(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
