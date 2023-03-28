package hunderedquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi2 {
    public static void main(String[] args) {

        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Integers
        List<String> list = Arrays.asList("geeks", "gfg", "g",
                "e", "e", "k", "s");

        list.stream().map(String::toUpperCase).collect(Collectors.toSet());
        list.stream().map(s -> s.length()).collect(Collectors.toSet());
    }
}