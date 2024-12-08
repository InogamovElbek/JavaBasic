package org.example;

import org.example.task.TaskService;
import org.example.user.Step;
import org.example.user.User;
import org.example.user.UserService;
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
        if (!update.hasMessage()) return;

        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();

        User user = userService.getUserByChatId(chatId);

        switch (user.getStep()) {
            case DONE -> {
                if (text.equals(Components.ADD)) {
                    user.setStep(Step.TASK);
                    sendMessage(chatId, Components.ADD_TASK);
                }
            }
            case TASK -> {
                if (taskService.create(chatId, text)) {
                    user.setStep(Step.DONE);
                    sendMessage(chatId, Components.SUCCESS_ADDED_TASK);
                } else {
                    sendMessage(chatId, "Xatolik: Ma'lumotlarni to'g'ri formatda kiriting!");
                }
            }
        }
    }

    public void sendMessage(long chatId, String message) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(String.valueOf(chatId))
                .text(message)
                .build();
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "YourBotUsername";
    }

    @Override
    public String getBotToken() {
        return "7532227813:AAGUaRZJn-Ibl6PnoSX6t7EtAI_spS7YxXU";
    }
}
