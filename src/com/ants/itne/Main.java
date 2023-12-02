package com.ants.itne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "bat cat rat tab";

        Map<String, Long> map = Arrays.stream(s.split(" "))
                .map(Main::sortCharacters).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


        map.entrySet().stream().filter(x->x.getValue()>1).forEach(x-> System.out.println(x.getKey()));
    }


    private static String sortCharacters(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
