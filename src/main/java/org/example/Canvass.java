package org.example;

import org.example.javapep.Circle;

public class Canvass {
    void  getArea(){
        Circle circle =new Circle();
        circle.area();//call method public area outside the package
    }
}
