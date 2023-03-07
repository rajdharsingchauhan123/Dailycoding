package hunderedquestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo34 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(8);
        list.add(8);
        System.out.println(list);
        list.forEach(i -> System.out.println(i));
        Set<Integer> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
        for (Integer j : collect) {
            System.out.println(j);
        }
        boolean equals = list.equals(list1);
    Integer s =  list.set(1,66);
    list.add(2,55);
        System.out.println(list);

        System.out.println(s);
        System.out.println(equals);

        System.out.println(collect);

    }
}