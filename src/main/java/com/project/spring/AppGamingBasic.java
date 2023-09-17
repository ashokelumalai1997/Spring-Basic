package com.project.spring;

import com.project.spring.game.MarioGame;
import com.project.spring.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var superContraGame =  new SuperContraGame();
        //tight coupling of Gamerunner to SuperContraGames
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
