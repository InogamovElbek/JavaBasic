package org.example.OOP3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2022, 30000, 4);
        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println();


        Truck truck = new Truck("Volvo", "FH16", 2021, 120000, 18.0);
        System.out.println("Truck Information:");
        truck.displayInfo();
    }
}
