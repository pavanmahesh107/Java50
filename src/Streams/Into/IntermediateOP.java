package Streams.Into;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateOP {
    public static void main(String[] args) {

        // Different Intermediate operations.

        // Filter method -> Internally it uses Predicate which is functional Interface returns boolean.
        // filter(Predicate <T> Predicate)

        // Ex : 1
        Stream<String> stringStream = Stream.of("Hello", "Everybody", "How", "are", "you");
        Stream<String> filterStream = stringStream.filter((String name) -> name.length() <= 3);

        List<String> collectFilter = filterStream.toList();  // = filterStream.collect(Collections.toList());
        System.out.println(collectFilter);

        // Ex : 2
        Stream<Integer> Intstream = Stream.of(10,4,7,9,6,12);
        Stream<Integer> filterInteger = Intstream.filter((Integer N) -> N % 2 == 0);

        List<Integer> filterIntegerList = filterInteger.toList();
        System.out.println(filterIntegerList);
    }
}
