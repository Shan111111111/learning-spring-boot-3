package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.GamesInterface;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamesInterface.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
