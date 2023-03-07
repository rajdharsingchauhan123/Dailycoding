package hunderedquestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo34 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(8);
        System.out.println(list);
        list.forEach(i-> System.out.println(i));

       list.sort(Comparator.naturalOrder());
       for(Integer i:list){
           System.out.println(i);
       }

    }
}
