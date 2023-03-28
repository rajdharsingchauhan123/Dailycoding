package hunderedquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numb= Arrays.asList(1,2,3,4,5,6);
        Set<Integer> collect = numb.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect);

    }


}
