package com.ants.teri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestMain {

    private int size;
    private Map<Integer,Long> map= new LinkedHashMap<>();
}
