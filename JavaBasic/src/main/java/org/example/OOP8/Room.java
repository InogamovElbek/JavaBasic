package org.example.OOP8;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private int number;
    private String status;  // Available, Booked
    private String type;

    public Room(int id, int number, String status, String type) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.type = type;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{id=" + id + ", number=" + number + ", status='" + status + "', type='" + type + "'}";
    }

    // Static list to simulate a database of rooms
    private static List<Room> roomList = new ArrayList<>();

    public static List<Room> getRoomList() {
        return roomList;
    }

    // Add room to list (simulate database add)
    public static void addRoom(Room room) {
        roomList.add(room);
    }

    // Get all booked rooms
    public static List<Room> getBookedRooms() {
        List<Room> bookedRooms = new ArrayList<>();
        for (Room room : roomList) {
            if ("BOOKED".equalsIgnoreCase(room.getStatus())) {
                bookedRooms.add(room);
            }
        }
        return bookedRooms;
    }

    // Get all available rooms
    public static List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : roomList) {
            if ("AVAILABLE".equalsIgnoreCase(room.getStatus())) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}
