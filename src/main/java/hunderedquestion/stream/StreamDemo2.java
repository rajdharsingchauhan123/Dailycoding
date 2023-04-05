package hunderedquestion.stream;

import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        Stream<String>strings=Stream.of("one ","two","three","four","five");
        strings.filter(s -> s.length()==3).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }
}
