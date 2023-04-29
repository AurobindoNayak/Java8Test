package com.ants.thread;

import java.util.Arrays;
import java.util.List;

public class ThreadEvenNumber implements Runnable {
    @Override
    public void run() {
        try {
            List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8);
            for (Integer i : evenNumber) {
                System.out.println(i);
                Thread.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
