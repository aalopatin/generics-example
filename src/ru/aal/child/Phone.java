package ru.aal.child;

public class Phone extends Product implements Comparable<Phone> {
    String model;

    public Phone(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    @Override
    public int compareTo(Phone other) {
        int result = Double.compare(price, other.price);
        return result;
    }
}
