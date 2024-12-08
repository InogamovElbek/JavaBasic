package org.example.Bot;

import org.example.AuthService.AuthService;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    private final AuthService authService = new AuthService(this);

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            authService.manage(message);
        }
    }

    public Message sendMessage(long chatId, String message) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(chatId)
                .text(message)
                .build();
        try {
            return execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


//    public Message sendMessageWithButton(long chatId, String message, boolean showTasksButton) {
//        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
//        List<KeyboardRow> keyboard = new ArrayList<>();
//
//
//        if (showTasksButton) {
//            KeyboardRow row = new KeyboardRow();
//            row.add(new KeyboardButton("Mening vazifalarim"));
//            keyboard.add(row);
//        }
//
//        keyboardMarkup.setKeyboard(keyboard);
//        keyboardMarkup.setResizeKeyboard(true);
//
//        SendMessage sendMessage = SendMessage.builder()
//                .chatId(chatId)
//                .text(message)
//                .replyMarkup(keyboardMarkup)
//                .build();
//        try {
//            return execute(sendMessage);
//        } catch (TelegramApiException e) {
//            throw new RuntimeException(e);
//        }
//    }












    public Message sendMessageWithButton(long chatId, String message, boolean showTasksButton) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();


        if (showTasksButton) {
            KeyboardRow row = new KeyboardRow();
            row.add(new KeyboardButton("Mening vazifalarim"));
            keyboard.add(row);
        }


        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        SendMessage sendMessage = SendMessage.builder()
                .chatId(chatId)
                .text(message)
                .replyMarkup(keyboardMarkup)
                .build();

        try {
            return execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
            throw new RuntimeException("Xabarni yuborishda muammo yuz berdi!", e);
        }
    }


    @Override
    public String getBotUsername() {
        return "botde";
    }

    @Override
    public String getBotToken() {
        return "7532227813:AAGUaRZJn-Ibl6PnoSX6t7EtAI_spS7YxXU";
    }
}
