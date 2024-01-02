package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindElementEg {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,5,7);

        //findFirst and findAny
        Optional<Integer> element = integerList.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }else{
            System.out.println("Stream is empty");
        }

        Optional<Integer> element1 = integerList.stream().findAny();
        if(element1.isPresent()){
            System.out.println(element.get());
        }else{
            System.out.println("Stream is empty");
        }


        //count,min,max
        long count=integerList.stream().count();
        Optional<Integer> min=integerList.stream().min(Comparator.comparing(Integer::valueOf));
        System.out.println(count +" "+min.get());

        Optional<Integer> max=integerList.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println(count +" "+min.get()+" "+max.get());
    }
}
