package com.ants.citi;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static int solution(int[] A) {
        List<Integer> l =Arrays.stream(A).sorted().boxed().distinct().collect(Collectors.toList());
        System.out.println(l);
        for(int i =0; i<l.size()-1;i++){
            if(l.get(i)!=l.get(i+1)-1){
                return l.get(i)+1;
            }
        }
        return l.get(l.size() - 1)+1;
    }

    public static void main(String[] args) {
        int A[]={1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
}

