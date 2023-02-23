package hunderedquestion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraylistDemo {

  


    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add("raj");
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add("rajdhiar");
        arrayList.add(5);


     //   System.out.println(arrayList);

//        arrayList.forEach(n-> System.out.println(n));
//        arrayList.remove("raj");
//        System.out.println(arrayList);
//        Iterator iterator = arrayList.iterator();
//        boolean b = iterator.hasNext();
//        System.out.println(b);
        Stream stream = arrayList.stream();
        Object collect = stream.collect(Collectors.toSet());







    }
}
