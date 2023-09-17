package com.project.spring;

import com.project.spring.game.MarioGame;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame marioGame) {
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
