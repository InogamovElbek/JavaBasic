package com.company;

import com.company.task.TaskService;
import com.company.user.Step;
import com.company.user.User;
import com.company.user.UserService;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private UserService userService;
    private TaskService taskService;

    public MyBot() {
        this.userService = new UserService(this);
        this.taskService = new TaskService(this);
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();
        Long chatId = message.getChatId();
        String text = message.getText();

        User user = userService
                .getUserByChatId(chatId);

        switch (user.getStep()) {
            case DONE -> {
                if (text.equals(Components.ADD)) {
                    user.setStep(Step.TASK);
                    sendMessage(chatId, Components.ADD_TASK);
                }
            }
            case TASK -> {
                boolean isCreated = taskService.create(chatId, text);
                sendMessage(chatId, Components.SUCCESS_ADDED_TASK);
                user.setStep(Step.DONE);
            }
        }


        System.out.println(user);


    }

    public Message sendMessage(long chatId, String message) {
        SendMessage sendMessage = SendMessage
                .builder()
                .chatId(chatId)
                .text(message)
                .build();
        try {
            return execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String getBotUsername() {
        return "https://t.me/tg_bot_a23bot";
    }

    @Override
    public String getBotToken() {
        return "7661811414:AAH0uRfMaqmtVhsT3EhylIL844GvHQkslhA";
    }
}
