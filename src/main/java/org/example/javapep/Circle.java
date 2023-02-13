package org.example.javapep;

public class Circle extends Shape {
private int radius;
public void area(){
    System.out.println("area" + 3.14 * radius *radius);

}
void fillcolour(){
    System.out.println("color"+ color);
}
}
class Circles{
    void  getarea(){
        Circle circle=new Circle();
        circle.area();
        // access to proteced field in subclass
        circle.fillcolour();
    }
}
