package com.example.demoSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("SuperContra")

public class SuperContra implements GamingConsole{
	
	public void up() {
		System.out.println("jump in super");
	}
	public void down() {
		System.out.println("slide in super");
	}
	public void left() {
		System.out.println("go left in super");
	}
	public void right() {
		System.out.println("go rightin super ");
	}


}


