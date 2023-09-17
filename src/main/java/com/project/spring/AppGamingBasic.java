package com.project.spring;

import com.project.spring.game.MarioGame;
import com.project.spring.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args){
        //var game = new MarioGame();
        var game =  new SuperContraGame();
        //tight coupling of Gamerunner to SuperContraGames
        // Coupling - how much work in changing something
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
