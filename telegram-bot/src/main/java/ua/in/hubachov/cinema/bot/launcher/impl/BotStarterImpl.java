package ua.in.hubachov.cinema.bot.launcher.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import ua.in.hubachov.cinema.bot.TelegramBot;
import ua.in.hubachov.cinema.bot.launcher.BotStarter;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Sashko on 4/9/17.
 */
@Component
@PropertySource("bot.properties")
public class BotStarterImpl implements BotStarter {

    @Value("${bot.name}")
    private String botName;
    @Value("${bot.token}")
    private String botToken;

    @Override
    public void startBot() {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new TelegramBot(botName, botToken));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
