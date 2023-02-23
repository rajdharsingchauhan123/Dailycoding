package hunderedquestion;

import java.util.LinkedList;
import java.util.List;

public interface LambdaFuction {
    void call();


}

class  FirstLambda{
    public static void main(String[] args) {
      LambdaFuction lambdaFuction=  ()-> System.out.println("hello werld");
      lambdaFuction.call();
        List list =new LinkedList();
    }
}
