package hunderedquestion.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional optional=Optional.of("This is a simple text");
        Optional optional1=Optional.empty();
        if(optional1.isPresent()){
            System.out.println("is present method is ture");
        }
        optional1.ifPresent(s->System.out.println("if present method is called on optional1"));

        optional.ifPresent(s->System.out.println("if present method is called on optional"));

    }

}
