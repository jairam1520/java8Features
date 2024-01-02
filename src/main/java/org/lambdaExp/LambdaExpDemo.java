package org.lambdaExp;

@FunctionalInterface
interface Shape{
    void create();

    public  default void about(){
        System.out.println("Default method");
    }
}

//Traditional way of giving implementation to interface method

class Square implements Shape{

    @Override
    public void create() {
        System.out.println("Square created");
    }
}

//Lambda exp to give implementation for functional interface method
public class LambdaExpDemo {
    public static void main(String[] args) {
        //InterfaceName variable = lambda exp
        Shape square1 = ()-> System.out.println("Square created");
        square1.create();

        ///passing lambda exp as argument to a function
        createShape(square1);

        //or
        createShape(()-> System.out.println("Square created"));

    }

    private static void createShape(Shape square1) {
        square1.create();
    }
}