package com.ants.mapiteration;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Aru");
        m.put(2, "Fanguli");

        m.forEach((x, y) -> {
            System.out.println("key " + x + " " + "value " + y);
        });

        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
