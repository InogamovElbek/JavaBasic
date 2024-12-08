package org.example.Stream_2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Task5 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 24),
                new User("Bob", 30),
                new User("Charlie", 29),
                new User("David", 35)
        );

        List<User> youngUsers = users.stream()
                .filter(user -> user.age < 30)
                .collect(Collectors.toList());

        System.out.println("30 dan kichik foydalanuvchilar: " + youngUsers);
        // Natija: [Alice (24), Charlie (29)]
    }
}
