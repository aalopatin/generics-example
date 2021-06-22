package ru.aal.parent;

import java.util.ArrayList;
import java.util.List;

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

        List<Camera> cameraListWildCard = new ArrayList<>(){{
            add(camera);
            add(camera1);
        }};
        List<Product> cameraListWildCard1 = new ArrayList<>();

        copyWildcard(cameraListWildCard, cameraListWildCard1);

        List<Camera> cameraList = new ArrayList<>(){{
            add(camera);
            add(camera1);
        }};
        List<Camera> cameraList1 = new ArrayList<>();

        copy(cameraList, cameraList1);

    }


    static void copyWildcard(List<? extends Product> src, List<? super Product> dest) {
        for (Product p: src) {
            dest.add(p);
        }
    }

    static <T extends Product> void copy(List<T> src, List<T> dest) {
        for (T p: src) {
            dest.add(p);
        }
    }

}
