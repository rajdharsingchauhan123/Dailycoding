package hunderedquestion;

public interface Drawable {
    public String draw();

}
  class  demo19{
      public static void main(String[] args) {
          Drawable d =()->{return "draw somthing";};
          System.out.println(d.draw());

      }




}
