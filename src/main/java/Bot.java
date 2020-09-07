import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;


public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();

        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            // Keyboard
            Keyboard k = new Keyboard();
            k.setButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    // Метод для обновления через лонгпулл, для получения сообщений(очередь ожидающих запросов)
    public void onUpdateReceived(Update update) {

        Model model = new Model();
        Message message = update.getMessage();

        if (message != null && message.hasText()) ;
        switch (message.getText()) {
            case "/start":
                sendMsg(message, "Этот робот показывает погоду в странах и городах!");
                break;
            case "Я могу...":
                sendMsg(message, "Быстро и лаконично показать погоду в городах и странах! Просто напиши город или страну)");
                break;
            case "Киев":
                try {
                    sendMsg(message, Weather.getWeatherKiev(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "Одесса":
                try {
                    sendMsg(message, Weather.getWeatherOdessa(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "Львов":
                try {
                    sendMsg(message, Weather.getWeatherLviv(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "Харьков":
                try {
                    sendMsg(message, Weather.getWeatherKharkiv(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case "Запорожье":
                try {
                    sendMsg(message, Weather.getWeatherZaporizhzhia(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "Полтава":
                try {
                    sendMsg(message, Weather.getWeatherPoltava(message.getText(), model));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


            default:
                try {
                    sendMsg(message, Weather.getWeather(message.getText(), model));
                    break;

                } catch (IOException e) {
                    sendMsg(message, "Такой город не найден!");
                }
        }
    }

//Вернуть имя указаное при регестрации
        public String getBotUsername ()
        {
            return "myweqther13t13Bot";
        }
        public String getBotToken ()
        {
            return "1332377138:AAHnsOcoEKnYH5LwLFtuOWJLryJUdbSpZlA";
        }
    }

