package hunderedquestion.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<Integer>listOfNumbers= Arrays.asList(1,2,3,4,5,6);

        listOfNumbers.parallelStream().forEach(n->System.out.println(n+" "+Thread.currentThread().getName()));
    }
}
