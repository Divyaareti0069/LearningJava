package com.example.demoSpringFramework.dependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class LazyInitialization {
	
@Component
	class ClassA{
		
	}

	
@Component 
@Lazy
class ClassB{
	private ClassA classA;

   ClassB(ClassA ClassA) {
		this.classA=classA;
	}
public void doSomething() {
	System.out.println("do something");
}
}
	public static void main(String[] args) {
		
		var context= new AnnotationConfigApplicationContext(LazyInitialization.class);
		System.out.println(context.getBean(ClassB.class));

	}

}
