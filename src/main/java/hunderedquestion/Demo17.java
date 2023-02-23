package hunderedquestion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo17 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(2124);
        for(int i:arrayList){
            System.out.println(i);
            // arrayList.remove(3); we can modify the arraylist using foreach loop in java
        }

      Iterator iterator =  arrayList.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
          iterator.remove();// we can modify the collection using iterator in java
      }


    }

}
