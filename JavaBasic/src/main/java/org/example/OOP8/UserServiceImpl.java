package org.example.OOP8;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();

    @Override
    public User createUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public User getUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User updateUser(int id, String fullName, String phone) {
        for (User user : userList) {
            if (user.getId() == id) {
                user.setFullName(fullName);
                user.setPhone(phone);
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean bookRoomForUser(int userId, int roomId) {
        User user = getUserById(userId);
        if (user != null) {
            Room room = getRoomById(roomId);
            if (room != null && "AVAILABLE".equalsIgnoreCase(room.getStatus())) {
                room.setStatus("BOOKED");  // Change room status to BOOKED
                user.setRoomId(roomId);    // Assign room to the user
                return true;
            }
        }
        return false;
    }

    private Room getRoomById(int roomId) {
        for (Room room : Room.getRoomList()) {
            if (room.getId() == roomId) {
                return room;
            }
        }
        return null;
    }
}
