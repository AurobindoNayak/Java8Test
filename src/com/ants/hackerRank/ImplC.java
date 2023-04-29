package com.ants.hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImplC extends BaseC implements BaseI {

    public static void main(String[] args) {
        (new ImplC()).method();

        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);

        String s = "world hel2o";
        //1- get all the value at each character
        char[] charArray = s.toCharArray();
        for(int i =0; i<=charArray.length;i++){
            if(Character.isDigit(charArray[i])){
                int x = (int) charArray[i];
                System.out.println(x);
             s= s.substring(0,charArray[i]);
                System.out.println(s);
            }
        }

    }
}
