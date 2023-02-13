package org.example.polymorphism;

public class Squre extends Shape{
    private int side;

    public Squre(int a){
        side=a ;
    }
    public int Area(){
        return side*side;
    }
}
