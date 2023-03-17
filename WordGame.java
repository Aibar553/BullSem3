package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            charList.add(String.valueOf(i));
            System.out.println("Welcome to the game of BULLS and COWS.");
            System.out.println("The objective in this game is for you to guess a 4-digit number.");
            System.out.println("The computer responds with how close your guess is to the target.");
            System.out.println("BULLS = # common digits with exact matches.");
            System.out.println("COWS = # common digits in wrong position.");
            System.out.println();
        }
        return charList;
    }
}
