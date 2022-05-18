package com.company;

import java.nio.charset.CharsetEncoder;

public class Main {

    public static void main(String[] args) {

        //keep the start game and other logic inside the game class
        // just keep new game
        Game game = new Game();
        game.startgame();
        game.pickDirection();

    }
}
