package com.ants.sumittest;

import com.ants.sumit1.Employee;

public class Main {

    public static void main(String[] args) {
        short a = 1;
        Employee shortEmployee = new Employee();
        com.ants.sumit.Employee stringEmployee = new com.ants.sumit.Employee();
        shortEmployee.setSalary(a);
        if(shortEmployee.getSalary()==1){
            stringEmployee.setSalary("hello");
        }
        System.out.println(stringEmployee.getSalary());
    }
}
