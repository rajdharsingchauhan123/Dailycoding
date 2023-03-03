package hunderedquestion;

public interface Sayble3 {
    default   void say(){

    }
    void say1();

}
class demo27{
    public static void saysomthing(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        Sayble3 s= System.out::println;
        Sayble3 sayble3=demo27::saysomthing;
        sayble3.say1();


    }
}
