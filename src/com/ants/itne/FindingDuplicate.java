package com.ants.itne;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingDuplicate {

    public static void main(String[] args) {
        String s = "bat cat rat tab";
        // String s = "bat cat";
        List<String> l1 = Arrays.asList(s.split(" "));
        System.out.println(l1);
        for(int i =0; i<l1.size(); i++){
            for(int j=i+1; j< l1.size();j++){
                char[] first = l1.get(i).toCharArray();
                char[] second = l1.get(j).toCharArray();
                Arrays.sort(first);
                Arrays.sort(second);
                if(Arrays.equals(first,second)){
                    System.out.println(second);
                }

            }
        }
    }

}
