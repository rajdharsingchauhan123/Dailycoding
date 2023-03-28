package hunderedquestion;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        boolean b = list.stream().allMatch(n -> n % 3 == 0);

    }
}
