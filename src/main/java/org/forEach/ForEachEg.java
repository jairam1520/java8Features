package org.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEg {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Raju"));
        personList.add(new Person(2,"Rani"));

        //using forEach method present in Iterable interface
        personList.forEach(p-> System.out.println(p));

        //using forEach method present in Stream class
        personList.stream().forEach(p-> System.out.println(p));
    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
