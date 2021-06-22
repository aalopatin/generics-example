package ru.aal.child;

public class Camera extends Product implements Comparable<Camera> {

    double pixel;

    public Camera(String name, double price, double pixel) {
        super(name, price);
        this.pixel = pixel;
    }

    @Override
    public int compareTo(Camera other) {
        int result = Double.compare(price, other.price);
        if (result != 0) {
            return Double.compare(pixel, other.pixel);
        } else {
            return result;
        }
    }
}
