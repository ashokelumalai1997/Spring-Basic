package com.project.spring;

import com.project.spring.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args){
        //GameRunner gameRunner = new GameRunner();
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
