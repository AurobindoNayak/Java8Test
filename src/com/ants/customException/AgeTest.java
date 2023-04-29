package com.ants.customException;

public class AgeTest {

    public static void getAge(int age) {
       if(age > 20){
           System.out.println("You are allowed");
       }else{
           throw new AgeValidationException("You are not allowed ");
       }
    }

    public static void main(String[] args) {
        getAge(15);
    }
}
