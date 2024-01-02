package org.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> products=getProduct();

        //filtering products with price greater then 25000
        List<Product> l1=products.stream().filter(product-> product.getPrice()>25000f).collect(Collectors.toList());
        l1.stream().forEach(System.out::println);
    }

    private static List<Product> getProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"TV",25000f));
        products.add(new Product(1,"Fridge",35000f));
        products.add(new Product(1,"AC",40000f));
        products.add(new Product(1,"Washing Machine",20000f));
        products.add(new Product(1,"Iron",50000f));
        return products;
    }
}
class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
