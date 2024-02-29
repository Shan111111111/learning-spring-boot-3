package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.GamesInterface;

@Configuration
@ComponentScan("com.shantesh.springboot3.learningspringboot3")
public class GamingAppLauncherApplication {
	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamesInterface.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}


