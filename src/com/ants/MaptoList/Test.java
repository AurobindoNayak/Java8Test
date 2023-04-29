package com.ants.MaptoList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String s = "Hello";
        List<String> s1 = Arrays.asList(s.split(""));
        Map<String, Long> collect = s1.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
