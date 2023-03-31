package hunderedquestion.optional;

import java.util.Optional;

public class optionalDemo1 {
    public static void main(String[] args) {
        String[]word=new String[10];
        Optional<String>checkNull=Optional.ofNullable(word[5]);
        if(checkNull.isPresent()){
            String wo=word[5].toUpperCase();
            System.out.println(wo);
        }
        else
            System.out.println("WORD IS NULL");
    }
}
