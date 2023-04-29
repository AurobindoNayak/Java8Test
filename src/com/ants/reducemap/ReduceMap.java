package com.ants.reducemap;

import java.util.Arrays;
import java.util.List;

public class ReduceMap {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
        Integer sum = l.stream().reduce(0,(a,b)->a+b);
        Integer sum1 =  l.stream().mapToInt(a->a).sum();
        System.out.println(sum1);
        System.out.println(sum);
        System.out.println(printData(24));

        String A = "java";
        StringBuffer sb = new StringBuffer(A);
        String b = new String(sb.reverse());
        System.out.println(sb.reverse());
        if(A.equals(b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static String printData(int n){
        return (n%2!=0)||(n%2==0 && (n>=6 && n<=20))?"Weird" : n%2==0 && (n>=2 && n<=5)||(n>20)?"Not Weird":"";
    }
}

