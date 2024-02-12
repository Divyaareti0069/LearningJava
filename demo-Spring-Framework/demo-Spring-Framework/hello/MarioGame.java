package com.example.demoSpringFramework.hello;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("slide");
	}
	public void left() {
		System.out.println("go left");
	}
	public void right() {
		System.out.println("go right");
	}

}
