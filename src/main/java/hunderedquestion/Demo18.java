package hunderedquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Demo18 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("skype","raj","mike");
        Spliterator<String> spliterator = list.spliterator();
        System.out.println(spliterator.tryAdvance(System.out::println));
        spliterator.forEachRemaining(System.out::println);
    }
}
