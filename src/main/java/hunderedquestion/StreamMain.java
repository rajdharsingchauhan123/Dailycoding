package hunderedquestion;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    static List<String>places=new ArrayList<>();

    public static List getPlaces(){
        // add places and country to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;

    }
    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        myPlaces.stream().filter((p)->p.startsWith("Nepal")).map((p)->p.toUpperCase()).sorted().forEach((p)-> System.out.println(p));
    }
}
