package hunderedquestion.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptonDemo10 {
    private static List<Integer>integers=new ArrayList<>();
    public static  void addIneger(Integer value){
        if(integers.contains(value)){
            integers.add(value);
        }
    }

    public static void main(String[] args) {
        addIneger(1);
    }
}
