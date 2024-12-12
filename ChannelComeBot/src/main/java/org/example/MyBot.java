package org.example;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    // Kanal postlaridan olingan video fayl ID'larini saqlash uchun ro'yxat
    static List<String> videoFileIds = new ArrayList<>();

    // Bot tokenini konstruktor orqali o'rnatish
    public MyBot() {
        super("7500520033:AAG8WOsf99cJf3GWsfe4PGx72aX1xYQm4QA"); // Bot tokenini o'zgartiring
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {

        // Kanal postlarini qayta ishlash
        if (update.hasChannelPost()) {
            if (update.getChannelPost().getChatId().equals("-1001234567890")) { // Kanal ID'sini o'zgartiring
                if (update.getChannelPost().hasVideo()) {
                    String videoId = update.getChannelPost().getVideo().getFileId();
                    videoFileIds.add(videoId);
                    System.out.println("Yangi video ID qo'shildi: " + videoId);
                }
            }
        }

        // Foydalanuvchi tomonidan yuborilgan xabarlarni qayta ishlash
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();

                // /start komandasi
                if (text.equals("/start")) {
                    sendMessage(message.getChatId(), "Bot ishga tushdi. Raqam yuboring, va kanal videolaridan birini olasiz!");
                } else {
                    try {
                        int index = Integer.parseInt(text); // Foydalanuvchi yuborgan raqam

                                    if (index >= 0 && index < videoFileIds.size()) {
                            SendVideo sendVideo = new SendVideo();
                            sendVideo.setChatId(message.getChatId());
                            sendVideo.setVideo(new InputFile(videoFileIds.get(index)));
                            execute(sendVideo); // Videoni yuborish
                        } else {
                            sendMessage(message.getChatId(), "Noto'g'ri raqam! Raqam 0 dan " + (videoFileIds.size() - 1) + " gacha bo'lishi kerak.");
                        }
                    } catch (NumberFormatException e) {
                        sendMessage(message.getChatId(), "Iltimos, faqat raqam kiriting.");
                    }
                }
            }
        }
    }

    // Matnli xabar yuborish uchun yordamchi metod
    public Message sendMessage(Long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);
        try {
            return execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    // Bot username'ini qaytaruvchi metod
    @Override
    public String getBotUsername() {
        return "YOUR_BOT_USERNAME_HERE"; // Bot username'ini o'zgartiring
    }
}
