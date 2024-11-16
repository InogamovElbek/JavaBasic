package org.example.OOP6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {

        Car gentra = new Car(1,"Gentra", "Oq");//0
        Car matiz = new Car(2,"Matiz", "Qora");//1
        create(gentra);
        create(matiz);
//        System.out.println(carList);
//        System.out.println(get(2));
        delete(1);
//        System.out.println(carList);

        update(2, "Oq");

        System.out.println(get(2));


    }

    private static void update(int id, String color) {
        for (Car car : carList) {
            if (car.getId() == id) {
                car.setColor(color);
            }
        }
    }

    private static void delete(int id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                carList.remove(car);
            }
        }
    }

    private static Car get(int id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    private static void create(Car car) {
        carList.add(car);
    }


}
