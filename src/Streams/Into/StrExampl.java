package Streams.Into;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrExampl {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("pavan","mahesh","radha","rupa");
        String ConcatedNames = names.stream().collect(Collectors.joining(","));
        System.out.println("Concated names are: " + ConcatedNames);
    }
}
