package com.ants.rakuten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        if(isEqual(s1,s2)){
            System.out.println("Hi I'm true");
        }
    }

    public static boolean isEqual(String s1, String s2){
        List<String> l1 = Arrays.asList(s1.split(""));
        List<String> l2 = Arrays.asList(s2.split(""));

//        Collections.sort(l1);
//        Collections.sort(l2);
//        System.out.println(l1);
//        System.out.println(l2);
//        return l1.equals(l2);

        Map<String,Long> m1 = l1.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        Map<String,Long> m2 = l2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       return m1.equals(m2);
    }

}
