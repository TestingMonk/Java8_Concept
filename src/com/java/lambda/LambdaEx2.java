package com.java.lambda;

public class LambdaEx2 {

    interface  Shape{

        void draw();
    }

    public static void main(String[] args){

        Shape rectangle = () -> System.out.println("draw method of rectangle");

        // passing functional interface variable as a method parameter

     print(rectangle);

    }

    public static void print(Shape shape){

        shape.draw();
    }


}
