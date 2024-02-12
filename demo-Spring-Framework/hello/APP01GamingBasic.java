package com.example.demoSpringFramework.hello;

public class APP01GamingBasic {

	public static void main(String[] args) {

 var game=new MarioGame();
 //var game=new SuperContra();
 
 var gameRunner=new GameRunner(game);
 gameRunner.run();
 
	}

}
