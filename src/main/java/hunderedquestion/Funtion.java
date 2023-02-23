package hunderedquestion;

public interface Funtion {
    void  call();

}
class AnonymousInnerClass{
    public static void main(String[] args) {
        Funtion funtion =new Funtion() {
            @Override
            public void call() {
                System.out.println("hello");

            }
        };
        funtion.call();
    }
}
