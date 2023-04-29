package com.ants.genpact;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Aru");
        Map<Employee,String> m = new LinkedHashMap<>();
        m.put(e1,"First");
        System.out.println(m.get(e1));

        e1.setName("Hello");
        System.out.println(m.get(e1));
    }
}
