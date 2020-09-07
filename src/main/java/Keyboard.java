import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Keyboard {

    protected void setButtons(SendMessage sendMessage) {
        // New keyboard
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        // Разметка клавиатуры
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        // Кому будет выводится клавиатура(всем или определенным пользователям)
        replyKeyboardMarkup.setSelective(true);
        //Подгонка клавиатуры под количество кнопок
        replyKeyboardMarkup.setResizeKeyboard(true);
        //Hide or no
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        KeyboardRow keyboardThirdRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Я могу..."));

        keyboardSecondRow.add(new KeyboardButton("Киев"));
        keyboardSecondRow.add(new KeyboardButton("Одесса"));
        keyboardSecondRow.add(new KeyboardButton("Львов"));

        keyboardThirdRow.add(new KeyboardButton("Запорожье"));
        keyboardThirdRow.add(new KeyboardButton("Харьков"));
        keyboardThirdRow.add(new KeyboardButton("Полтава"));


        keyboardRowList.add(keyboardFirstRow);
        keyboardRowList.add(keyboardSecondRow);
        keyboardRowList.add(keyboardThirdRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }
}


