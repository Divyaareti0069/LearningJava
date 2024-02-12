package com.example.demoSpringFramework.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
	
	record Person(String firstName,int age,Address address) {};
	record Address(String FirstLine,String city) {};
	
	@Bean
	public String firstName() {
		return "divya";
	}
	

	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		return new Person("deepika",23,new Address("Kovela street","nsp"));
		
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(firstName(),age(),address2());
		
	}
	
	@Bean
	public Person person3Parameters(String firstName,int age,Address Address1) {
		return new Person(firstName,age,Address1);
		
	}
	
	@Bean
	public Person person4Qualifier(String firstName,int age,@Qualifier(value="Address-3")Address Address) {
		return new Person(firstName,age,Address);
		
	}
	
	@Bean(name="Address1")
	@Primary
	public Address address() {
		return new Address("kovela street","nsp");
	}
	
	@Bean(name="Address2")
	
	public Address address2() {
		return new Address("belandhur","Bangalore");
	}
	
	@Bean(name="Address3")
	@Qualifier(value="Address-3")
	
	public Address address3() {
		return new Address("charlotte","NC");
	}

}
