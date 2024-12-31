package com.java.lambda;

public class LambdaEx2 {

    interface  Shape{

        void draw();
    }

    // passing functional interface variable as a method parameter
    public static void main(String[] args){

        Shape rectangle = () -> System.out.println("draw method of rectangle");
       // rectangle.draw();

        Shape circle = () -> System.out.println("draw method of circle");

       // Shape square = () -> System.out.println("draw method of square");
        // square.draw();

        print(rectangle);
        print(circle);

        // directly passing lambda expression
        print(()->System.out.println("draw method of square"));


    }

    public static void print(Shape shape){

        shape.draw();
    }


}
