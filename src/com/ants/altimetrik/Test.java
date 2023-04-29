package com.ants.altimetrik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "aru", "male", 2000),
                                                    new Employee(2, "aaa", "male", 10000),
                                                    new Employee(3, "bbb", "male", 6000),
                                                    new Employee(4, "ccc", "female", 8000),
                                                    new Employee(5, "ddd", "male", 4000),
                                                    new Employee(6, "eee", "female", 1000));

        List<Employee> male = employees.stream().filter(x -> x.getGender().equals("male")).
                sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).
                collect(Collectors.toList());

        System.out.println(male);

        Double collect = employees.stream().collect(Collectors.summingDouble(x -> x.getSalary()));
        System.out.println(collect);
    }
}
