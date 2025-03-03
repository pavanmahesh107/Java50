package Streams.Into;

import java.util.Arrays;
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

        // EX:2
        Stream<String> alphStream = Stream.of("Hey","Fellos", "How", "you", "doing");
        Stream<String> stringStream2 = alphStream.map((String str) -> str.toUpperCase());

        List<String> stream1 = stringStream2.collect(Collectors.toList());
        System.out.println(stream1);

        // FlatMap -> It will Iterate over the elements of the complex collection then Flattens it.
        // It uses <Functional < T,Stream<R> mapper>

        // Ex : 1
        List<List<String>> complCollect = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("CODING", "IS", "EASY")
        );

        Stream<String> flatPro = complCollect.stream().flatMap((List<String> str) -> str.stream());
        System.out.println(flatPro.toList());

        Stream<String> flatPro1 = complCollect.stream().flatMap((List<String> str) -> str.stream().map(String::toLowerCase));  // 2 Intermediate operations flatMap & map
        System.out.println(flatPro1.toList());


        // Distinct -> Removes duplicate elements from the array
        Integer[] arr = {9,7,3,7,3,1,2};
        Stream<Integer> Strdist = Arrays.stream(arr).distinct();
        System.out.println(Strdist.toList());

        // Sorted - it sorts the array in ascending order.
        Integer[] sortArr = {9,7,3,7,3,1,2};
        Stream<Integer> strSort = Arrays.stream(sortArr).sorted();
        System.out.println(strSort.toList());

        // Peek - It helps to print or see the intermediate results of the Stream
        List<Integer> lisPeek = Arrays.asList(2,8,5,9,4);
        Stream<Integer> peekEle = lisPeek.stream().filter((Integer var ) -> var >= 4)
                .peek((Integer res) -> System.out.println(res))
                .map((Integer val) -> -1* val);

        System.out.println(peekEle.toList());

     }

}
