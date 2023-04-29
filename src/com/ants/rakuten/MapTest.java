package com.ants.rakuten;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {

    //filter common values from two maps

    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        Map<String,String> m2 = new HashMap<>();
        m1.put("a","abc");
        m1.put("b","def");

        m2.put("a","abc");
        m2.put("c","def");

//        m1.entrySet().stream().filter
//                (x -> m2.entrySet().stream().anyMatch(y -> (y.getKey() == x.getKey() &&
//                        y.getValue() == x.getValue()))).findAny().isPresent();

        List<Map.Entry<String, String>> collect = m1.entrySet().stream().
                                                  filter(x -> m2.entrySet().stream().anyMatch(y -> (y.getKey().equals(x.getKey())
                                                          && y.getValue().equals(x.getValue())))).collect(Collectors.toList());
        System.out.println(collect);

        for(Map.Entry<String, String> m : collect){

            System.out.println(m.getKey()+m.getValue());

        }
    }
}
