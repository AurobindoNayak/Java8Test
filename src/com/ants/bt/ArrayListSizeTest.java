package com.ants.bt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSizeTest extends ArrayList {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
    }
    @Override
    public boolean add(Object o) {
        if (this.size() > 2) {
            return super.add(o);
        }
       return false;
    }

}
