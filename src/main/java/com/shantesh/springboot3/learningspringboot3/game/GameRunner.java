package com.shantesh.springboot3.learningspringboot3.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	GamesInterface marioGame;
	
	public GameRunner(@Qualifier("MarioGameQualifier") GamesInterface marioGame) {
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
