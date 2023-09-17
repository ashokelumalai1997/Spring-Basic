package com.project.spring;

import com.project.spring.game.MarioGame;
import com.project.spring.game.SuperContraGame;

public class GameRunner {
    SuperContraGame game;
    public GameRunner(SuperContraGame marioGame) {
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
