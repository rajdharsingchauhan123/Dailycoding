package hunderedquestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DEmo1111 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        System.out.println(sum(list));
    }
        public static int sum (List<Integer>list)

        {
//            return list.stream().filter(i->i> list.size()).mapToInt(i->i).sum();
            Iterator<Integer> iterator = list.iterator();
            int res = 0;
            while (iterator.hasNext()) {
                int num = iterator.next();

                if (num > list.size()) {
                    res += num;
                }

            }



        return res;
    }
}