package org.example.OOP8;

import java.util.List;

public class RoomService {

    public List<Room> getBookedRooms() {
        return Room.getBookedRooms();
    }

    public List<Room> getAvailableRooms() {
        return Room.getAvailableRooms();
    }
}
