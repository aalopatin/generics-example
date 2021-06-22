package ru.aal.parent;

public class Container<T extends Product & Comparable<Product>> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
