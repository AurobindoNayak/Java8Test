package com.ants.itne;

import java.util.*;

public class DuplicateTest {

    //Approach
    //1- split the String based on " "
    //2- Iterate the list of String & convert it to character Array
    //3- Sort the character Array so bat & tab became abt
    //4- Convert the char Array to String
    //5- Add it in a set in side the loop

    public static void main(String[] args) {
        String s = "bat cat rat tab";  // bat & tab are duplicate as they contain same character in shuffling manner
        List<String> l1 = Arrays.asList(s.split(" "));
        Set<String> s3 = new TreeSet<>();
        for(String s1 : l1){
           char [] a=  s1.toCharArray();
           Arrays.sort(a);
          // System.out.println(a);
           String s2 = new String(a);
           s3.add(s2);
        }
        System.out.println(s3);
        System.out.println(l1);
    }
}
