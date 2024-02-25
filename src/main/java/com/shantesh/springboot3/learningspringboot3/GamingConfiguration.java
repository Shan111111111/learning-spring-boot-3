package com.shantesh.springboot3.learningspringboot3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shantesh.springboot3.learningspringboot3.game.PacmanGame;


@Configuration
public class GamingConfiguration {
	
	@Bean
	public PacmanGame returnGame() {
		return new PacmanGame();
	}
}
