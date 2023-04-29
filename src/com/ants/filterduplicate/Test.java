package com.ants.filterduplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,2,3,4,5,6,6,6);
        Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> collect = l.stream().filter(x -> s.add(x) == false).collect(Collectors.toSet());
        //System.out.println(collect);

        Map<Integer,Long> map = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)->{
            if(v>1){
                System.out.println(k);
            }
        });
    }
}
