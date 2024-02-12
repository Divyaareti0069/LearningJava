package com.example.demoSpringFramework.dependency;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class PostPreAnnotationcontextLauncher {

	@Component
	
	class Dependency{
		SomeDependency someDependency;
		
		Dependency(SomeDependency someDependency){
			super();
			this.someDependency=someDependency;
			System.out.println("all dependencies are invoked");
			
		}
		
		@PostConstruct
		public void initialize() {
			SomeDependency.getReady();
		}
		
		@PreDestroy
		public void cleanup() {
			System.out.println("cleaning up..");
		}
	}
	
@Component
	
	class SomeDependency{

	public static void getReady() {
		System.out.println("Some Dependency intialized");
		
	}
	
	
		
	}
	
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(PostPreAnnotationcontextLauncher.class)) {
			System.out.println(context.getBean(Dependency.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}


