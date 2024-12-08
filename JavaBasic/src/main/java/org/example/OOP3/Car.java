package org.example.OOP3;

public class Car extends Vehicle {
    private int doors;


    public Car(String brand, String model, int year, double price, int doors) {
        super(brand, model, year, price);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
