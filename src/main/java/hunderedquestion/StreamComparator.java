package hunderedquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamComparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

        System.out.println("The sorted stream according "
                + "to provided Comparator is : ");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
