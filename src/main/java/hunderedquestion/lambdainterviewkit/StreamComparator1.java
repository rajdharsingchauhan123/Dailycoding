package hunderedquestion.lambdainterviewkit;

import java.util.stream.Stream;

public class StreamComparator1 {
    public static void main(String[] args) {
        String[] array = { "GFG", "Geeks", "for",
                "GeeksforGeeks", "GeeksQuiz" };

        System.out.println("The sorted stream is :");

        Stream.of(array).sorted((str1,str2)->Character.compare(str1.charAt(str1.length()-1),str2.charAt(str2.length()-1))).forEach(s->System.out.println(s));
    }
}
