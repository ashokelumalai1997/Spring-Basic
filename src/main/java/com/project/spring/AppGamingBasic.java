package com.project.spring;

import com.project.spring.game.PacManGame;

public class AppGamingBasic {
    public static void main(String[] args){
        //var game = new MarioGame();
        //var game =  new SuperContraGame();
        var game =  new PacManGame();
        //tight coupling of Gamerunner to SuperContraGames
        // Coupling - how much work in changing something
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
