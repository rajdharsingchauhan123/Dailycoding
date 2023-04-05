package hunderedquestion.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        Stream<String>strings=Stream.of("one","two","three","four");
//        List<String>result=new ArrayList<>();

//
//      strings.filter(s -> s.length()==3).map(String::toUpperCase).forEach(result::add);
//        System.out.println(result);
        List<String>result1=strings.filter(s -> s.length()==3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result1);
    }
}
