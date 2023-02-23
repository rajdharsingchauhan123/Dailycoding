package hunderedquestion;

public class demo {
    int b=1000;
    public static void main(String[] args) {
        int a = 10;
        Student s = () -> {
            System.out.println(a);
        };
        s.run();
    }

}
