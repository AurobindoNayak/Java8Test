package com.ants.groupby;

import com.ants.flatmap.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GropByTest {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Aru", "IT"),
                new Student(2, "Fangu", "Civil"),
                new Student(3, "Bapa", "Army"),
                new Student(4, "Xxx", "IT"),
                new Student(5, "ZZZ", "IT"));

        Map<String, List<Student>> employeeMap = studentList.stream().collect(Collectors.groupingBy(x -> x.getDept()));
        System.out.println(employeeMap);


        String s = "aabbcc";
        //List<String> s1 = Arrays.asList(s.split(""));
        Map<String, Long> map = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);

        List<String> list = Arrays.asList("aabbcc","abc","aaabccc","aaabbbccc");


        for(String ss: list){
            Map<String, Long> map1 = Arrays.asList(ss.split("")).stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//            if(map1.values().stream().distinct().limit(2).count()==1) {
//                System.out.println(ss);
//            }

            Set<Long> sss = new LinkedHashSet<>(map1.values());
            if(sss.size()==1){
                System.out.println(ss);
            }
        }

    }
}
