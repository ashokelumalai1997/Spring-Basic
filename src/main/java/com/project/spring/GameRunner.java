package com.project.spring;

import com.project.spring.game.GamingConsole;
import com.project.spring.game.MarioGame;
import com.project.spring.game.SuperContraGame;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole marioGame) {
        this.game=marioGame;
    }
    public void run() {
        System.out.println("Running Game: "+game );
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
