package com.example.demoSpringFramework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App03HelloWorldSpring {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(App03HelloWorldSpring.class);
context.getBean(GamingConsole.class).up();;
context.getBean(GameRunner.class).run();





 
	}

}
