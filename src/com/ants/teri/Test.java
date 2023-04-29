package com.ants.teri;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<TeriObj> tList = Arrays.asList(new TeriObj(10111,01),
                new TeriObj(10111,01),
                new TeriObj(10111,06),
                new TeriObj(10111,03),
                new TeriObj(10111,03));

        System.out.println(tList.size());

       /* Map<Integer, List<TeriObj>> collect = tList.stream().collect(Collectors.groupingBy(x -> x.getRequestId()));
        System.out.println(collect);*/

        Map<Integer, Long> m =
                tList.stream().collect(Collectors.groupingBy(x->x.getRequestId(), Collectors.counting()));
        System.out.println(m);

        TestMain testMain = new TestMain();
        testMain.setSize(tList.size());
        testMain.setMap(m);

        System.out.println(testMain);
    }
}
