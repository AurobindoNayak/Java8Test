package com.ants.citi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {
    public static int solution(String S, int[] C) {
       List<String> charcterList = Arrays.asList(S.split(""));
       List<Integer> l = Arrays.stream(C).boxed().toList();
       List<Integer> index = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
       for(int i=0; i<charcterList.size()-1; i++){
           if(charcterList.get(i).equals(charcterList.get(i+1))){
              if(l.get(i)<l.get(i+1)){
                  index.add(i);
              }else{
                  index.add(i+1);
              }

           }
       }

        System.out.println(index);
        for(int i=0; i<index.size();i++){
            sum.add(l.get(index.get(i)));
        }
        return sum.stream().reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {
        int A[] ={3,4,5,6};
        System.out.println(solution("abaa",A));
    }
}
