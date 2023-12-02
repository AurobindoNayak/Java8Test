package com.ants.bt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = l.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        String s = "fanguuuu";
        s.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        List<String> s1 = Arrays.asList(s.split(""));
        Map<String, Long> collect = s1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        String name = "aabbbccc";
        List<String> names = Arrays.asList(name.split(""));
        Map<String, Long> collect1 = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        String name1 = "aaaaa";
        Set<String> nameSet = new LinkedHashSet<>();
        Arrays.asList(name1.split("")).stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .forEach((k,v)->nameSet.add(k));
        if(nameSet.size()==1){
            System.out.println("I'm unique");
        }


    }
}
