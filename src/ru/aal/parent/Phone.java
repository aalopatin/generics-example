package ru.aal.parent;

public class Phone extends Product {
    String model;

    public Phone(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

}
