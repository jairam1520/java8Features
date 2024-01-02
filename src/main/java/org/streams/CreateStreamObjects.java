package org.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        //Different ways of creating Streams

        //1.Using Stream class
        Stream<String> stream = Stream.of("s1","s2","s3");
        stream.forEach((e)-> System.out.println(e));
        //stream.forEach(System.out::println);

        System.out.println("-----------");

        //2.Using Collection class
        Collection<String> collection = Arrays.asList("s4","s5","s6");
        collection.stream().forEach(System.out::println);

        System.out.println("-----------");

        //3. Using classes who implement Collection class
        List<String> list = Arrays.asList("s7","s8","s9");
        list.stream().forEach(System.out::println);

        System.out.println("-----------");
        //Creating stream on array object
        String[] arr = {"s10","s11","s12"};
        Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.forEach(System.out::println);

    }
}
