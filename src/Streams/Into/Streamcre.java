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
        Stream<Integer> streamAsStatic = Stream.of(10,20,30,40);
        System.out.println(streamAsStatic.count());

        //From Stream Builder
      Stream.Builder<Integer> StreamBuilder = Stream.builder();
      StreamBuilder.add(10).add(20).add(30);
      Stream<Integer> streambuilderAs = StreamBuilder.build();
        System.out.println(streambuilderAs.count());

        // From Stream Iterate
        Stream<Integer> streamAsIterate = Stream.iterate(10,(Integer n) -> n * 2).limit(20);
        System.out.println(streamAsIterate.count());

    }
}

