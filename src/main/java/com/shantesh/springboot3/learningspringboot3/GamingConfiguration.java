package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.GamesInterface;
import com.shantesh.springboot3.learningspringboot3.game.PacmanGame;


@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamesInterface returnGame() {
		return new PacmanGame();
	}
	@Bean
	public GameRunner returnGameRunner(GamesInterface returnGame) {
		return new GameRunner(returnGame);
	}
}
