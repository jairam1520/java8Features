package org.function;

import java.util.function.Function;

class MyClass implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        //Traditional way
        Function<String,Integer> function = new MyClass();
        System.out.println(function.apply("Hello World"));

        //Using Lamda exp
        Function<String,Integer> function1 = (String s)-> {
            return s.length();
        };
        System.out.println(function1.apply("Hello World to you"));
    }
}
