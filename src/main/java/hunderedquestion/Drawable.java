package hunderedquestion;

public interface Drawable {
    public String draw(String name);

}
  class  demo19{
      public static void main(String[] args) {
          Drawable d =(name)->{return "raj"+name;};
          System.out.println(d.draw("how are you"));

      }




}
