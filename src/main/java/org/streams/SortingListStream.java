package org.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingListStream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Orange","Mango","Banana","Grapes");

        System.out.println("Sorting ascending order");
        //Ways to sort list of stream in ascending order
        //1.Using naturalOrder() present in Comparator class
        fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        //2.By passing lambda exp as implementation of compareTo() method
        fruits.stream().sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);

        //3.Using sorted function without argument
        fruits.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting descending order");
        //Ways to sort list of stream in descending order
        //1.Using reverseOrder() present in Comparator class
        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //2.By passing lambda exp as implementation of compareTo() method
        fruits.stream().sorted((o1,o2)->o2.compareTo(o2)).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Abc",25000));
        employeeList.add(new Employee(3,"Cde",23000));
        employeeList.add(new Employee(6,"Adk",22000));
        employeeList.add(new Employee(4,"Sdk",35000));
        employeeList.add(new Employee(2,"Ysj",15000));

        //sort list on id in ascending order
        employeeList.stream().sorted((Employee o1, Employee o2)->o1.getId()-o2.getId()).forEach(System.out::println);

        System.out.println("---------------------------");
        //sort list on name in ascending order
        employeeList.stream().sorted((Employee o1, Employee o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);

        System.out.println("---------------------------");
        //sort list on salary in descending order
        employeeList.stream().sorted((Employee o1, Employee o2)->o1.getSalary()-o2.getSalary()).forEach(System.out::println);








    }
}
