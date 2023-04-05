package hunderedquestion.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        Stream<String> strings=Stream.of("one","two","three","four");

        String s = strings.max(Comparator.comparing(String::length)).orElseThrow();
        System.out.println(s);
    }
}
