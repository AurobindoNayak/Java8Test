package com.ants.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("aa","aa","aa","b","c","bb","bb","c");
        List<String> disctinctList = s.stream().distinct().collect(Collectors.toList());
        System.out.println(disctinctList);
    }
}
