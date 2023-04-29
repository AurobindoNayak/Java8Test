package com.ants.incedo;

import lombok.Setter;

public final class Student {
    private final String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
