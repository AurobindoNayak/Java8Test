package com.ants.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {

    public static void main(String[] args) {

        String s = "HelloWorld";
        Map<String, Long> m = Arrays.stream(s.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);

        List<String> unique = Arrays.stream(s.toLowerCase().split("")).distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
