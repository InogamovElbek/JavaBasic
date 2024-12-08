package com.company.user;

import com.company.MyBot;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private List<User> userList = new ArrayList<>();
    private MyBot myBot;

    public UserService(MyBot myBot) {
        this.myBot = myBot;
    }


//    public void manage(Message message) {
//        Long chatId = message.getChatId();
//
//        User userByChatId = getUserByChatId(chatId);
//
//        if (userByChatId == null) {
//            return create(chatId);
//        } else {
//            return userByChatId;
//        }
//    }

    public User getUserByChatId(Long chatId) {
        Optional<User> optionalUser = userList.stream()
                .filter(u -> u.getChatId() == chatId)
                .findFirst();

        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return create(chatId);
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
