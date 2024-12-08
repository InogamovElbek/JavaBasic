package org.example.OOP7;

public class Main {
    public static void main(String[] args) {
        // Room yaratish
        Room room1 = new Room(1, 101, "Available", "Single");
        Room room2 = new Room(2, 102, "Occupied", "Double");

        // Room qo'shish
        Room.create(room1);
        Room.create(room2);

        // Roomlarni olish
        System.out.println(Room.getById(1)); // Room{id=1, number=101, status='Available', type='Single'}
        System.out.println(Room.getByNumber(102)); // Room{id=2, number=102, status='Occupied', type='Double'}

        // Barcha roomlarni olish
        System.out.println(Room.getAll()); // List of all rooms

        // Status bo'yicha roomlarni olish
        System.out.println(Room.getAllByStatus("Available")); // List of rooms with 'Available' status

        // Type bo'yicha roomlarni olish
        System.out.println(Room.getAllByType("Single")); // List of rooms with 'Single' type

        // Room numberini yangilash
        Room updatedRoom = Room.updateNumberById(1, 201);
        System.out.println(updatedRoom); // Room{id=1, number=201, status='Available', type='Single'}

        // Room statusini yangilash
        Room updatedStatusRoom = Room.updateStatusById(2, "Available");
        System.out.println(updatedStatusRoom); // Room{id=2, number=102, status='Available', type='Double'}

        // Roomni id orqali o'chirish
        System.out.println(Room.removeById(1)); // true

        // Roomni number orqali o'chirish
        System.out.println(Room.removeByNumber(102)); // true
    }
}
