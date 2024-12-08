package org.example.user;

import org.example.MyBot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> userList = new ArrayList<>();
    private MyBot myBot;

    public UserService(MyBot myBot) {
        this.myBot = myBot;
    }

    public User getUserByChatId(Long chatId) {
        return userList.stream()
                .filter(u -> u.getChatId() == chatId)
                .findFirst()
                .orElseGet(() -> create(chatId));
    }

    public User create(Long chatId) {
        User user = User.builder()
                .chatId(chatId)
                .step(Step.DONE)
                .build();
        userList.add(user);
        return user;
    }
}
