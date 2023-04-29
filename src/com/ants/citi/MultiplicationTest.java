package com.ants.citi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationTest {

    public static int solution(int[] A) {
        List<Integer> l = Arrays.stream(A).boxed().collect(Collectors.toList());
        int result = l.stream().reduce(1, (a, b) -> a * b);
        return result >0 ?1 : result<0 ?-1 :0;
    }

    public static void main(String[] args) {
        int []A= {1,2,3,-5};
        System.out.println(solution(A));
    }
}

