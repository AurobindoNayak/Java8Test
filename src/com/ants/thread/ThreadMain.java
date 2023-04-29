package com.ants.thread;

import java.util.Arrays;
import java.util.List;

public class ThreadMain implements Runnable {
    @Override
    public void run() {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        try {
            List<Integer> oddNumber = Arrays.asList(1, 3, 5, 7);


            for (Integer i : oddNumber) {
                t1.start();
                System.out.println(i);
                t2.start();
                t1.wait();
            }

            List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8);
            for (Integer i : evenNumber) {
                System.out.println(i);
                Thread.sleep(1);
                t2.wait();
                t1.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws Exception {
        ThreadMain threadMain = new ThreadMain();
        threadMain.run();
//        ThreadOddNumber to = new ThreadOddNumber();
//        ThreadEvenNumber te = new ThreadEvenNumber();
//        to.run();
//        te.run();

    }
}
