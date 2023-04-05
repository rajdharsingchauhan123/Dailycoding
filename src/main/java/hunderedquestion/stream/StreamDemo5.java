package hunderedquestion.stream;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        Stream<String>strings=Stream.of("raj","sin");
        LinkedList<String> collect = strings.filter(s -> s.length() == 3).map(String::toUpperCase).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect);
    }
}
