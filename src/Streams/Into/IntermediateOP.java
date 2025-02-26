package Streams.Into;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOP {
    public static void main(String[] args) {

        // Different Intermediate operations.

        // Filter method -> Internally it uses Predicate which is functional Interface returns boolean.
        // filter(Predicate <T> Predicate) -> filter the element.

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

        // Map method - > internally it uses Function interface which takes one param returns before element.
        //map<Function<T,R> mapper> -> Used to transform each element.

        // Ex: 1
        Stream<String> mapStream = Stream.of("Hey", "EVERYBODY", "HOW", "ARE", "DOING");
        Stream<Integer> stream = mapStream.map((String str) -> str.length());

        List<Integer> stringStream1 = stream.collect(Collectors.toList());
        System.out.println(stringStream1);
    }
}
