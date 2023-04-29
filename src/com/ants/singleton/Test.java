package com.ants.singleton;

public class Test {

    public static Test t = null;

    private Test() {

    }

    public Test getTest() {
        return t == null ? t = new Test() : t;
    }
}
