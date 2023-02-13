package org.example.polymorphism;

public class Circlee extends Shape {
    private  int radius;
    public Circlee(int r){
        radius =r;
    }
    // other constructors
    public double area(){
        return Math.PI*radius*radius;
    }

}
