package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ььь";
    }

    @Override
    public String getBotToken() {
        return "7532227813:AAGUaRZJn-Ibl6PnoSX6t7EtAI_spS7YxXU";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            String chatId = update.getMessage().getChatId().toString();

            if (update.getMessage().hasText()) {
                String userMessage = update.getMessage().getText();

                switch (userMessage) {
                    case "/start":
                        sendMainMenu(chatId);
                        break;
                    case "👑 Click Premium":
                        sendTextMessage(chatId, "Click Premium xizmati haqida ma'lumot");
                        break;
                    case "💳 Kartalarim":
                        sendTextMessage(chatId, "Kartalarim haqida ma'lumot");
                        break;
                    case "💸 To'lov":
                        sendTextMessage(chatId, "To'lov qilindi");
                        break;
                    case "💰 Balans":
                        sendTextMessage(chatId, "Sizning balansingiz 100 000 so'm");
                        break;
                    case "🔄 O'tkazmalar":
                        sendTextMessage(chatId, "O'tkazmalar ro'yxati");
                        break;
                    case "📜 To'lovlar tarixi":
                        sendTextMessage(chatId, "Sizning to'lovlar tarixingiz");
                        break;
                    case "⚙ Kiruvchi hisoblar":
                        sendTextMessage(chatId, "Kiruvchi hisoblar haqida ma'lumot");
                        break;
                    case "⭐ Saralangan to'lovlar":
                        sendTextMessage(chatId, "Saralangan to'lovlar ro'yxati");
                        break;
                    default:
                        sendTextMessage(chatId, "Tugmani bosing yoki haqiqiy buyruq kiriting.");
                        break;
                }
            }


            if (update.getMessage().hasContact()) {
                sendContactInfo(chatId, update.getMessage().getContact().getPhoneNumber(), update.getMessage().getContact().getFirstName());
            }

            if (update.getMessage().hasLocation()) {

                Double latitude = update.getMessage().getLocation().getLatitude();
                Double longitude = update.getMessage().getLocation().getLongitude();
                sendLocationInfo(chatId, latitude, longitude);
            }
        }
    }


    public void sendMainMenu(String chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Iltimos, quyidagi variantlardan birini tanlang:");


        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> keyboard = new ArrayList<>();


        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("👑 Click Premium"));
        row1.add(new KeyboardButton("💳 Kartalarim"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("💸 To'lov"));
        row2.add(new KeyboardButton("💰 Balans"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("🔄 O'tkazmalar"));
        row3.add(new KeyboardButton("📜 To'lovlar tarixi"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("⚙ Kiruvchi hisoblar"));
        row4.add(new KeyboardButton("⭐ Saralangan to'lovlar"));


        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton contactButton = new KeyboardButton("📱 Contact jo'natish");
        contactButton.setRequestContact(true);
        KeyboardButton locationButton = new KeyboardButton("📍 Lokatsiya jo'natish");
        locationButton.setRequestLocation(true);
        row5.add(contactButton);
        row5.add(locationButton);


        keyboard.add(row1);
        keyboard.add(row2);
        keyboard.add(row3);
        keyboard.add(row4);
        keyboard.add(row5);


        keyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(keyboardMarkup);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public void sendTextMessage(String chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public void sendContactInfo(String chatId, String phoneNumber, String firstName) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Sizning jo'natgan contact ma'lumotingiz:\nTelefon: " + phoneNumber + "\nIsm: " + firstName);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public void sendLocationInfo(String chatId, Double latitude, Double longitude) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Sizning jo'natgan lokatsiyangiz:\nKenglik: " + latitude + "\nUzunlik: " + longitude);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
