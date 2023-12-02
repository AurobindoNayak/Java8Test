package com.ants.morganstanley;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("code","edoc","cdoe","farmer");
        List<String> l1 = l.stream().map(Test::sorted).collect(Collectors.toList());
        System.out.println(l1);
        Set<String> s = new LinkedHashSet<>(l1);
        System.out.println(s);
    }

    public static
    String sorted(String s){
        char[] so = s.toCharArray();
        Arrays.sort(so);
        return new String(so);
    }
}
