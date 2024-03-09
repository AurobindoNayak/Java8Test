package com.ants.genpact;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Aru");
        Map<Employee,String> m = new HashMap<>();
        m.put(e1,"First");
        System.out.println(m);
        System.out.println(m.get(e1));

        e1.setName("Hello");
       // m.put(e1,"First");
        System.out.println(m);
        System.out.println(m.get(e1));
    }
}
