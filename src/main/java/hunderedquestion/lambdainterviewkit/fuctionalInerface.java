package hunderedquestion.lambdainterviewkit;

import java.util.function.Function;

public interface fuctionalInerface {
    public static void main(String[] args) {
        Function<String,Integer>function=x->x.length();
        Integer apply = function.apply("jello");
        System.out.println(apply);
    }
}
