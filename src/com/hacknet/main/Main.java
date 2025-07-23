package com.hacknet.main;

import com.hacknet.game.Game;
import standard.exceptions.InvalidInputException;
import standard.std;

public class Main extends std {
    public static Game game;

    public static void main(String[] args) {
        game = new Game("Hacknet 2024.0208.0 (Copyright (c) AhQiangTW. Do not distribute!)");
        try {
            game.start();
        } catch (InvalidInputException e) {
            sc.next();
        }
    }
}