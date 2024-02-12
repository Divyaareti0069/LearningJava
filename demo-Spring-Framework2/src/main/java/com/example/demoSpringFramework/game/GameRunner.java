package com.example.demoSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContra")GamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("running game:"+game);
		game.down();
		game.up();
		game.left();
		game.right();
		
	}

}
