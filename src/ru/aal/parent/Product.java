package ru.aal.parent;

import java.util.Objects;

public class Product implements Comparable<Product> {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(price, other.price);
    }
}
