package hunderedquestion;

import java.util.LinkedList;

public class linkedCount {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(123);
        linkedList.add(1234);

        long count = linkedList.stream().count();
        System.out.println(count);

    }
}
