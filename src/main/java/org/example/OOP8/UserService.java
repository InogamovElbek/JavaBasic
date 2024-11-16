package org.example.OOP8;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    User updateUser(int id, String fullName, String phone);
    boolean deleteUser(int id);


    boolean bookRoomForUser(int userId, int roomId);
}
