package com.ants.bt;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        String s = "aba";
//        StringBuffer sb = new StringBuffer(s);
//        StringBuffer reverse = sb.reverse();
//        System.out.println(reverse);
//        if(reverse.equals(sb)){
//            System.out.println("hello");
//        }
//
        String s1 = "hello";
        char[] s2 = s1.toCharArray();
        String s3 ="";
        for(int i = s2.length-1; i>=0; i--){
            s3 = s3+s2[i];
        }

        System.out.println(s3);
        if(s3.equals(s1)){
            System.out.println("hey");
        }

        String name = "Aurobindo Nayak";
        List<String> names = Arrays.asList(name.split(" "));
        String s4 = "";
        for(int i = names.size()-1; i>=0; i--){
            s4 =s4+names.get(i)+" ";

        }
        System.out.println(s4);
        System.out.println(s4.length());

    }

}
