package com.java.lambda;

/**
 * ### **Updated Key Concepts Demonstrated**
 *
 * 1. **Functional Interface**:
 *    - An interface with a single abstract method, enabling the use of lambda expressions.
 *    - In this program, `Shape` is the functional interface.
 *
 * 2. **Lambda Expressions**:
 *    - A concise way to implement functional interfaces.
 *    - Eliminates the need for creating separate classes or anonymous inner classes.
 *
 * 3. **Dynamic Behavior**:
 *    - The `rectangle` variable dynamically holds an instance of a class that implements the `Shape` interface using the lambda expression.
 *
 * 4. **Assignment of Implementation**:
 *    - The `rectangle` variable of type `Shape` is assigned the lambda expression implementation of the `draw()` method.
 *    - This demonstrates the dynamic and flexible nature of functional programming in Java.
 */


interface Shape{

    void draw();  // in java under interface if one method is present it is treated as abstract method
}



public class LambdaExample1 {

    public static void main(String[] args){
     // below code provides implememtation of draw method of interface
        Shape rectangle = () -> {

            System.out.println("draw method  of rectangle");
        };

        Shape circle = () -> System.out.println("draw method of circle");

        Shape square = () -> System.out.println("draw method of square");

        rectangle.draw();
        circle.draw();
        square.draw();
     //   The Shape interface is used as the type for the rectangle variable.
  //     The rectangle variable is assigned a lambda expression that provides the implementation for the draw() method.

  //      (): Represents the parameter list of the method; empty because draw() takes no arguments.
//->: The lambda operator or arrow tokem separates parameters from the method body.
 //       {}: The body of the lambda expression containing the implementation of the method.

    }
}
