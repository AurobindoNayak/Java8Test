package com.ants.ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9, 6};
        Arrays.sort(a);
        List<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
            List<List<Integer>> pairs = findPairs(a,i);
            System.out.println(pairs);
        }


    }

   /* public static List<List<Integer>> findPairs(int[] a) {
        List<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
        }
        List<List<Integer>> l2 = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (l.contains(sum)) {
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(a[i]);
                    l1.add(a[j]);
                    l2.add(l1);

                }
            }

        }
        return l2;
    }*/

    public static List<List<Integer>> findPairs(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        List<List<Integer>> l2 = new ArrayList<>();
        while (start < end) {
            int sum = a[start] + a[end];
            if (sum == target) {
                List<Integer> l = new ArrayList<>();
                l.add(a[start]);
                l.add(a[end]);
                start++;
                end--;
                l2.add(l);
            } else if (sum < target) {
                start++;
            } else {


            }
        }
        return l2;
    }

}
