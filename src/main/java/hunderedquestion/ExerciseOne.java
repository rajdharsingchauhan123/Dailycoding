package hunderedquestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        String[]colours={"red ","white","black","yellow"};
        List<String>list=new ArrayList<>();
        for (String colour:colours)
            list.add(colour);
        String []removeColours={"red","white","black"};

        List<String >list1=new ArrayList<>();
        for(String colour:removeColours)
            list1.add(colour);

        removeColours(list,list1);

        for (String colour:list)
            System.out.println(colour);


    }
    private static void removeColours(Collection<String>collection,Collection<String>collection1){
        Iterator<String>iterator=collection.iterator();
        while (iterator.hasNext()){
            if(collection1.contains(iterator.next()))
                System.out.println("duplicate");
        }
    }
}
