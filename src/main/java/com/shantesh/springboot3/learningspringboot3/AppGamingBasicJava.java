package com.shantesh.springboot3.learningspringboot3;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.MarioGame;
import com.shantesh.springboot3.learningspringboot3.game.SuperContraGame;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
		
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		
	}

}
