package com.shantesh.springboot3.learningspringboot3.game;

public class GameRunner {

	MarioGame marioGame;

	public GameRunner(MarioGame marioGame) {
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
