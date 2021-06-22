package ru.aal.parent;

public class Camera extends Product {

    double pixel;

    public Camera(String name, double price, double pixel) {
        super(name, price);
        this.pixel = pixel;
    }

    @Override
    public int compareTo(Product other) {
        int result = super.compareTo(other);
        if (result == 0 && other instanceof Product) {
            Camera otherCamera = (Camera) other;
            return Double.compare(pixel, otherCamera.pixel);
        } else {
            return result;
        }
    }
}
