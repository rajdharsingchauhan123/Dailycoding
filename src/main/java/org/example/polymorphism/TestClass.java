package org.example.polymorphism;

public class TestClass {
    public static void main(String[] args) {
        Shape shape1 =new Circlee(101);
       System.out.println( shape1.Area());
        Shape shape2=new Squre(11);
        System.out.println(shape2.Area());

    }
}
