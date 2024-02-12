package com.example.demoSpringFramework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App03HelloWorldSpring {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
context.getBean(GamingConsole.class).up();;
context.getBean(GameRunner.class).run();





 
	}

}
