package com.ants.incedo;

public class Test {

    private static Test t = null;

    private Test() {

    }

     synchronized public static Test getTest() {
        return t == null ? t = new Test() : t;
    }


}
