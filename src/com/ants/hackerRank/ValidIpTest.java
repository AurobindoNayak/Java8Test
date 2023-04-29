package com.ants.hackerRank;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidIpTest {

    public static void main(String[] args) {

        System.out.println(isValidIp("259.259.259.259"));
//        String s = "000.12.12.034";
//        List<String> l = Arrays.asList((s.split( "\\.")));
//        System.out.println(l);

    }

    public static boolean isValidIp(String ip){

        //splitting ip based on . symbol
        List<String> l = Arrays.asList((ip.split("\\.")));

        List<String> xx= l.stream().filter(x->x.matches("[a-zA-Z]+")).collect(Collectors.toList());
        if(!xx.isEmpty()){
            return false;
        }

        if(l.size()==4){
            //checking if the size of each ip greater than 3
            List<String> collect = l.stream().filter(x -> x.length() > 3).collect(Collectors.toList());

            if(collect==null || collect.isEmpty() ){
                List<Integer> intList =  l.stream().map(Integer::valueOf).collect(Collectors.toList());

                if(intList.stream().distinct().count() == intList.size()-2){
                    return false;
                }

                for(int x : intList){
                    return x>255?false :true;
                }
            }
            //}
        }



      return  false;
    }

}
