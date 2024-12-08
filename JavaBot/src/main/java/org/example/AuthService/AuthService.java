package org.example.AuthService;

import org.example.Components.Components;
import org.example.Bot.MyBot;
import org.example.step.Step;
import org.example.user.User;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private final List<User> userList = new ArrayList<>();
    private final MyBot myBot;

    public AuthService(MyBot myBot) {
        this.myBot = myBot;
    }

    public void manage(Message message) {
        Long chatId = message.getChatId();
        String text = message.getText();
        User userByChatId = getUserByChatId(chatId);


        if (text.equals("/add")) {
            if (userByChatId == null) {
                create(chatId);
            }
            myBot.sendMessageWithButton(chatId, Components.ADD_TASK_PROMPT, true);
            userByChatId.setStep(Step.ADDING_TASK);
            return;
        }


        if (userByChatId != null && userByChatId.getStep() == Step.ADDING_TASK) {
            userByChatId.getToDoList().add(text);
            StringBuilder tasks = new StringBuilder(Components.TASK_ACCEPTED + "\n");
            for (int i = 0; i < userByChatId.getToDoList().size(); i++) {
                tasks.append(i + 1).append(". ").append(userByChatId.getToDoList().get(i)).append("\n");
            }

            myBot.sendMessageWithButton(chatId, tasks.toString(), true);
            return;
        }


        if (text.equals("Mening vazifalarim")) {
            if (userByChatId != null && !userByChatId.getToDoList().isEmpty()) {
                StringBuilder tasks = new StringBuilder(Components.YOUR_TASKS + "\n");
//                for (int i = 0; i < userByChatId.getToDoList().size(); i++) {
//                    tasks.append(i + 1).append(". ").append(userByChatId.getToDoList().get(i)).append("\n");
//                }
                myBot.sendMessage(chatId, tasks.toString());
            } else {
                myBot.sendMessage(chatId, Components.NO_TASKS);
            }
            return;
        }


//        if (text.equals("/delete")) {
//            if (userByChatId != null) {
//                userByChatId.setToDoList(new ArrayList<>());
//                userByChatId.setStep(Step.START);
//                myBot.sendMessage(chatId, "Vazifalar o‘chirildi.");
//                myBot.sendMessage(chatId, Components.START);
//            } else {
//                create(chatId);
//                myBot.sendMessage(chatId, Components.START);
//            }
//            return;
//        }


        if (userByChatId == null) {
            create(chatId);
            myBot.sendMessage(chatId, Components.START);
        } else {
            switch (userByChatId.getStep()) {
                case START:
                    userByChatId.setFirstName(text);
                    userByChatId.setStep(Step.LASTNAME);
                    myBot.sendMessage(chatId, Components.LASTNAME);
                    break;
                case LASTNAME:
                    userByChatId.setLastName(text);
                    userByChatId.setStep(Step.USERNAME);
                    myBot.sendMessage(chatId, Components.USERNAME);
                    break;
                case USERNAME:
                    userByChatId.setUsername(text);
                    userByChatId.setStep(Step.PHONE);
                    myBot.sendMessage(chatId, Components.PHONE);
                    break;
                case PHONE:
                    userByChatId.setPhone(text);
                    userByChatId.setStep(Step.SUCCESS);
                    myBot.sendMessage(chatId, Components.SUCCESS);
                    break;
                case SUCCESS:
                    myBot.sendMessage(chatId, Components.REGISTERED);
                    break;
                default:
                    break;
            }
        }
    }

    public User getUserByChatId(Long chatId) {
        return userList.stream()
                .filter(u -> chatId.equals(u.getChatId()))
                .findFirst()
                .orElse(null);
    }

    public User create(Long chatId) {
        User user = User.builder()
                .chatId(chatId)
                .step(Step.START)
                .toDoList(new ArrayList<>())
                .build();
        userList.add(user);
        return user;
    }
}
