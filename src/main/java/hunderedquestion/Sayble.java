package hunderedquestion;

public interface Sayble {
    String say(String massage);

}
class Demo24{
    public static void main(String[] args) {
        Sayble sayble =(massage -> {
            String s="i  like you";
            String s1=s+massage;
            return s1;

        });
        System.out.println(sayble.say("son"));
    }

}
