package com.bridgelabz.java8.maxmincomparator;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MaxMinOperator {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Ankush",1234567.00,"SDET"));
        empList.add(new Employee("Sachin",15562237.00,"QA"));
        empList.add(new Employee("Mayuresh",12000067.00,"QA"));
        empList.add(new Employee("Rohit",12654657.00,"Automation"));

       Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> maxSalaryByDeptName =empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.reducing(BinaryOperator
                        .maxBy(salaryComparator))));
        maxSalaryByDeptName.forEach((dentName,emp)->{
            System.out.println(dentName);
            Employee employee = emp.get();
            System.out.println(employee);
        });
    }
}
