package com.ants.ust;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable{

    private int id;
    private String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
