package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            charList.add(String.valueOf(i));
            System.out.println("Добро пожаловать в игру Быки-Коровы.");
            System.out.println("Цель в этой игре состоит в том, чтобы вы угадали 4-значное число.");
            System.out.println("Компьютер сообщает, насколько близко ваше предположение к цели.");
            System.out.println("БЫКИ = # общие цифры с точными совпадениями.");
            System.out.println("КОРОВЫ = # обычные цифры в неправильном положении.");
            System.out.println();
        }
        return charList;
    }
}
