package com.ants.morganstanley;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulations {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("code","edoc","cdoe","farmer");
        List<String> l1 = new ArrayList<>();
        for (String s : l){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String s1 = String.valueOf(a);
            l1.add(s1);
        }

        List<String> collect = l1.stream().distinct().collect(Collectors.toList());
        Collections.sort(collect,(a,b)->b.length()-a.length());
        System.out.println(collect);


        List<String> l3 = Arrays.asList("code","edoc","cdoe","farmer");
        boolean b = hasSameChar("code", "edoc");
        System.out.println(b);
    }

    static boolean hasSameChar(String str1, String str2){
        for(char c : str1.toCharArray()){
            if(str2.indexOf(c) < 0 )
                return false;
        }
        for(char c : str2.toCharArray()){
            if(str1.indexOf(c) < 0 )
                return false;
        }
        return true;
    }

}
