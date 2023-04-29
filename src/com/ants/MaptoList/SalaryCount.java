package com.ants.MaptoList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryCount {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aru", 5000),
                new Employee(2, "Bru", 15000),
                new Employee(3, "Cru", 20000),
                new Employee(4, "Dru", 5000),
                new Employee(5, "Eru", 35000));

       Double salary = employeeList.stream().map(x->x.getSalary()).reduce(0.0,(a, b)->a+b);

        System.out.println(salary);

    }
}
