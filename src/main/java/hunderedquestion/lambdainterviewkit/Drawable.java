package hunderedquestion.lambdainterviewkit;

public interface Drawable {
public void draw();

}
   class LambdaExpressionExample{
    public static void main(String[] args) {
         int width =10 ;
         Drawable drawable =()->{
                System.out.println("drawing "+width);

            };

         drawable.draw();
    }

}

