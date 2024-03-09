package com.ants.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "A", 15, 24),
                new Student(2, "B", 16, 26),
                new Student(3, "C", 14, 20),
                new Student(4, "A", 17, 24));

        //Sorting by name
        List<Student> sortedName = students.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println(sortedName);

        //Sorting by age
        List<Student> sortedAge = students.stream().sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
        System.out.println("Sorted by Age::" + sortedAge);

        //Sorted by mark
        List<Student> sortedMark = students.stream().sorted((a, b) -> Double.compare(b.getMarks(), a.getMarks())).collect(Collectors.toList());
        System.out.println("Sorted by mark:: " + sortedMark);

        //Sort by mark & name
        Comparator<Student> studentComparator = Comparator.comparing(Student::getMarks)
                .thenComparing(Student::getName);
        List<Student> sortByMarkAge = students.stream().sorted((studentComparator)).collect(Collectors.toList());
        System.out.println("Sorted by name & Mark:: "+sortByMarkAge);
    }
}