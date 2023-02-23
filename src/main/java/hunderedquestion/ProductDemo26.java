package hunderedquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDemo26 {
    int id;
    String name;
    float price;

    public ProductDemo26(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample10{
    public static void main(String[] args) {
        List<ProductDemo26> list = new ArrayList<ProductDemo26>();

        //Adding Products
        list.add(new ProductDemo26(1, "HP Laptop", 25000f));
        list.add(new ProductDemo26(3, "Keyboard", 300f));
        list.add(new ProductDemo26(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);

        });
        for (ProductDemo26 p:list){
            System.out.println(p.id+""+p.name+" "+p.price);
        }


    }}

