package hunderedquestion.stream;

import java.util.Collections;
import java.util.List;

public class StreamDemo1 {



    public static void main(String[] args) {
        List<String>strings=List.of("one","two","four","five","six");
        long count = strings.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);
        System.out.println(count);
    }

}
