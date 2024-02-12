package com.example.demoSpringFramework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {
	
	public void up() {
		System.out.println("jump in pac");
	}
	public void down() {
		System.out.println("slide in pac");
	}
	public void left() {
		System.out.println("go left in pac");
	}
	public void right() {
		System.out.println("go rightin pac");
	}


}
