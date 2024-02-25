package com.shantesh.springboot3.learningspringboot3.game;

public class GameRunner {

	GamesInterface marioGame;
	
	public GameRunner(GamesInterface marioGame) {
		this.marioGame = marioGame;
	}

	public void run() {
		System.out.println("Running game :" + marioGame);
		marioGame.up();
		marioGame.right();
		marioGame.down();
		marioGame.left();
	}

}
