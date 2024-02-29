package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.GamesInterface;
import com.shantesh.springboot3.learningspringboot3.game.PacmanGame;

@Configuration
@ComponentScan("com.shantesh.springboot3.learningspringboot3")
public class AppGamingBasicJava {
	

	@Bean
	public GameRunner returnGameRunner(GamesInterface returnGame) {
		return new GameRunner(returnGame);
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(AppGamingBasicJava.class)) {
			context.getBean(GamesInterface.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}


