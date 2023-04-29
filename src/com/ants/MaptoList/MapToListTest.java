package com.ants.MaptoList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListTest {

    public static void main(String[] args) {

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee(1, "Aru", 5000));
        map.put(2, new Employee(2, "Bru", 15000));
        map.put(3, new Employee(3, "Cru", 20000));
        map.put(4, new Employee(4, "Dru", 5000));
        map.put(5, new Employee(5, "Eru", 35000));

        List<String> employeeList = map.entrySet().stream()
                .map(x->x.getValue()).filter(x->x.getSalary()>10000)
                .map(x->x.getName()).collect(Collectors.toList());

        map.entrySet().stream().map(x->x.getValue());

        System.out.println(employeeList);

    }


}
