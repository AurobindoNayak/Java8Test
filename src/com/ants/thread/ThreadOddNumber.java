package com.ants.thread;

import java.util.Arrays;
import java.util.List;

public class ThreadOddNumber implements Runnable{
    @Override
    public void run() {
        Thread t = new Thread();
        try {
            List<Integer> oddNumber = Arrays.asList(1, 3, 5, 7);
            for (Integer i : oddNumber) {
                System.out.println(i);
                t.wait();
                t.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
