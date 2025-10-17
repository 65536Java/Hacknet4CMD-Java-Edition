package com.hacknet.main;

import com.hacknet.game.Game;
import standard.exceptions.InvalidInputException;
import standard.std;

public class Main extends std {
    public static Game game;

    public static void main(String[] args) {
        game = new Game("Hacknet for CMD");
        try {
            game.start();
        } catch (InvalidInputException e) {
            sc.next();
        }
    }
}