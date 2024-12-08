package org.example.OOP8;
public class User {
    private int id;
    private String fullName;
    private String phone;
    private int roomId;  // Xona id si, agar bron qilingan bo'lsa

    public User(int id, String fullName, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.roomId = -1; // Boshlang'ichda xona bron qilinmagan
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", fullName='" + fullName + "', phone='" + phone + "', roomId=" + roomId + "}";
    }
}
