package hunderedquestion;

public interface Drawable {
    public String draw(String name,String name1);

}
  class  demo19{
      public static void main(String[] args) {
          Drawable d =(name,name1)->{return "raj"+name +" "+name1;};
          System.out.println(d.draw("how are you","you wanna go to outside"));

      }




}
