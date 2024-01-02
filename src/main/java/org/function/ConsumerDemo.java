package org.function;

import java.util.function.Consumer;

class MyConsumerDemo implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
public class ConsumerDemo{
    public static void main(String[] args) {
        //Traditional way
        MyConsumerDemo myConsumerDemo = new MyConsumerDemo();
        myConsumerDemo.accept("Hello");

        //Lambda exp
        Consumer<String> consumer = (String s)-> {
            System.out.println(s);
        };
        consumer.accept("World");
    }
}