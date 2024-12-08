package org.example.OOP7;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private int number;
    private String status;
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

    // toString method to display room details
    @Override
    public String toString() {
        return "Room{id=" + id + ", number=" + number + ", status='" + status + "', type='" + type + "'}";
    }

    // Static list to simulate a database of rooms
    private static List<Room> roomList = new ArrayList<>();

    // 1. Create room
    public static Room create(Room room) {
        roomList.add(room);
        return room;
    }

    // 2. Get room by id
    public static Room getById(int id) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null; // Room not found
    }

    // 3. Get room by number
    public static Room getByNumber(int number) {
        for (Room room : roomList) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        return null; // Room not found
    }

    // 4. Get all rooms
    public static List<Room> getAll() {
        return roomList;
    }

    // 5. Get all rooms by status
    public static List<Room> getAllByStatus(String status) {
        List<Room> result = new ArrayList<>();
        for (Room room : roomList) {
            if (room.getStatus().equalsIgnoreCase(status)) {
                result.add(room);
            }
        }
        return result;
    }

    // 6. Get all rooms by type
    public static List<Room> getAllByType(String type) {
        List<Room> result = new ArrayList<>();
        for (Room room : roomList) {
            if (room.getType().equalsIgnoreCase(type)) {
                result.add(room);
            }
        }
        return result;
    }

    // 7. Update room number by id
    public static Room updateNumberById(int id, int number) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                room.setNumber(number);
                return room;
            }
        }
        return null; // Room not found
    }

    // 8. Update room status by id
    public static Room updateStatusById(int id, String status) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                room.setStatus(status);
                return room;
            }
        }
        return null; // Room not found
    }

    // 9. Remove room by id
    public static Boolean removeById(int id) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                roomList.remove(room);
                return true;
            }
        }
        return false; // Room not found
    }

    // 10. Remove room by number
    public static Boolean removeByNumber(int number) {
        for (Room room : roomList) {
            if (room.getNumber() == number) {
                roomList.remove(room);
                return true;
            }
        }
        return false; // Room not found
    }
}
