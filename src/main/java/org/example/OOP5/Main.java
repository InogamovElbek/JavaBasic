package org.example.OOP5;

public class Main {
    public static void main(String[] args) {
        Transport transport1 = new Mashina();
        Transport transport2 = new Velosiped();

        System.out.println("Mashina tezligi: " + transport1.tezlik() + " km/h");
        System.out.println("Velosiped tezligi: " + transport2.tezlik() + " km/h");
    }
}
