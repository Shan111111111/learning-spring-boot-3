package com.shantesh.springboot3.learningspringboot3.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamesInterface{
	public void up() {
		System.out.println("pac pac");
	}
	public void down() {
		System.out.println("eat pac pac");
	}
	public void left() {
		System.out.println("dance pac pac");
	}
	public void right() {
		System.out.println("hip hop pac pac");
	}


}
