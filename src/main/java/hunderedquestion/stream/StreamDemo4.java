package hunderedquestion.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        Stream<String> strings=Stream.of("one","two","three","four");
        List<String> collect = strings.filter(s -> s.length() == 3).map(String::toUpperCase).collect(Collectors.toUnmodifiableList());
        System.out.println(collect);
    }
}
