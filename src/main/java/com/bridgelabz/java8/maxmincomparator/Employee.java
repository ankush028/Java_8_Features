package com.bridgelabz.java8.maxmincomparator;

import java.util.StringJoiner;

public class Employee {
    private String name;
    private Double salary;
    private String deptName;

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("salary=" + salary)
                .add("deptName='" + deptName + "'")
                .toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee(String name, Double salary, String deptName) {
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
    }
}
