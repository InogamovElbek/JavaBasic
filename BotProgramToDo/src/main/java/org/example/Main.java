package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the Telegram Bots API
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);

            // Register your bot
            MyBot myBot = new MyBot();
            botsApi.registerBot(myBot);

            System.out.println("Bot is running...");
        } catch (TelegramApiException e) {
            e.printStackTrace();
            System.out.println("Failed to start the bot: " + e.getMessage());
        }
    }
}