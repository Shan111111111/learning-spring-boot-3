package com.shantesh.springboot3.learningspringboot3;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.MarioGame;
import com.shantesh.springboot3.learningspringboot3.game.PacmanGame;
import com.shantesh.springboot3.learningspringboot3.game.SuperContraGame;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
