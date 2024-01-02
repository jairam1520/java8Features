package org.oops;

class Parent{
    public String name="Hello";
    public static String common="hii";

    public Parent(){

    }


    public static void m1(){
        System.out.println("m1 of parent");
    }
    public void m2(){
        System.out.println("m2 of parent");
    }
}
class Child extends Parent{

    public static void m1(){
        System.out.println("m1 of child");
    }

//    @Override
//    public void m2(){
//        System.out.println("m2 of child");
//    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Child.m1();
        Child c1 = new Child();
        c1.m2();

        Parent p1 = new Parent();
        System.out.println(p1.name);
        System.out.println(Parent.common);
    }
}
