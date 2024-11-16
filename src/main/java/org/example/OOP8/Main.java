package org.example.OOP8;
public class Main {
    public static void main(String[] args) {
        // UserService va RoomService ob'ektlarini yaratish
        UserService userService = new UserServiceImpl();
        RoomService roomService = new RoomService();

        // Xonalarni yaratish
        Room room1 = new Room(1, 101, "AVAILABLE", "Single");
        Room room2 = new Room(2, 102, "AVAILABLE", "Double");
        Room.addRoom(room1);
        Room.addRoom(room2);

        // Foydalanuvchini yaratish
        User user1 = new User(1, "John Doe", "123-456-7890");
        userService.createUser(user1);

        // Xonani foydalanuvchiga bron qilish
        userService.bookRoomForUser(1, 1); // User 1, Room 1ni bron qiladi
        System.out.println("Bron qilingan xonalar: " + roomService.getBookedRooms());
        System.out.println("Bron qilinmagan xonalar: " + roomService.getAvailableRooms());
    }
}
