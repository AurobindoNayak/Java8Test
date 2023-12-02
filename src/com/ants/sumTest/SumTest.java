package com.ants.sumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumTest {

    public static void main(String[] args) {

        int i = 123456;
        String s = String.valueOf(i);
        List<String> s1 = Arrays.asList(s.split(""));
        int sum = s1.stream().mapToInt(x -> Integer.parseInt(x)).sum();
        System.out.println(sum);

        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();

        Student st1 = new Student(1, "aru");
        Student st2 = new Student(2, "aru2");

        Student st3 = new Student(1, "aru");
        Student st4 = new Student(4, "aru2");

        studentList1.add(st1);
        studentList1.add(st2);

        studentList2.add(st3);
        studentList2.add(st4);


//        studentList1.addAll(studentList2);
//        System.out.println(studentList1);

        List<Student> uniqueList = studentList1.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
        List<Student> commonList = studentList1.stream()
                .filter(studentList2::contains)
                .collect(Collectors
                        .toList());


        System.out.println(commonList);


        List<Student> result = studentList1.stream()
                .filter(x -> studentList2.stream().anyMatch(y -> y.getId() != x.getId() && y.getName().equals(x.getName())))
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
