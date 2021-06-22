package ru.aal.child;

public class Main {

    public static void main(String[] args) {
        Container<Camera> container =  new Container<>();
		Container<Phone> container1 = new Container<>();

		Camera camera = new Camera("Camera", 100, 13);
        Camera camera1 = new Camera("Camera", 100, 15);

        int result = camera.compareTo(camera1);

        if (result < 0) {
            System.out.println("Work!");
        }

        container.setItem(camera);
        container1.setItem(new Phone("Phone", 200, "Smartphone"));

    }
}
