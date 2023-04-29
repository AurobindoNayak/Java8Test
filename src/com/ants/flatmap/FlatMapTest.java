package com.ants.flatmap;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(1, "Aru",
                        Arrays.asList(new Address("Odisha"), new Address("Delhi"))),
                new Employee(2, "Fangu",
                        Arrays.asList(new Address("Odisha"), new Address("Delhi"))));
        System.out.println(employeeList);

        List<List<Address>> addressList = employeeList.stream().map(x -> x.getAddressList()).collect(Collectors.toList());
        System.out.println(addressList);

        List<Address> flatAddress = employeeList.stream().flatMap(x -> x.getAddressList().parallelStream()).collect(Collectors.toList());
        System.out.println(flatAddress);

        List<Address> flatAddress1 = employeeList.stream().flatMap(x -> x.getAddressList().stream()).collect(Collectors.toList());
        System.out.println(flatAddress1);


        List<String> emptyList = new ArrayList<>();
        List<String> emptyList1 = new ArrayList<>();
        List<String> a = Optional.ofNullable(emptyList).orElse(emptyList1).stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
    }
}
