package Streams.Into;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamcre { // Stream creation
    public static void main(String[] args) {

        // 1. From Collection
        List<Integer> salaryList = Arrays.asList(2000,2300,1000,600); // Collection
        Stream<Integer> StreamFromIntegerList = salaryList.stream();  // Stream creation
        System.out.println("The count is: " + StreamFromIntegerList.count());


        // 2. From Array
        Integer[] salArray = {10,21,78,34,90};
        Stream<Integer> StreamFromArray = Arrays.stream(salArray);
        System.out.println("The count is: " + StreamFromArray.count());

        //From Static Method


    }
}

