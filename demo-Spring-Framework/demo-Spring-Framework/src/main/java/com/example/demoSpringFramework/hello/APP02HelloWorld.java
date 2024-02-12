package com.example.demoSpringFramework.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demoSpringFramework.hello.HelloWorldConfiguration.Person;

public class APP02HelloWorld {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
System.out.println(context.getBean("firstName"));
System.out.println(context.getBean("age"));
System.out.println(context.getBean("person"));
System.out.println(context.getBean("Address1"));
System.out.println(context.getBean("Address2"));
System.out.println(context.getBean("person2MethodCall"));
System.out.println(context.getBean("person3Parameters"));
//System.out.println(context.getBean("Address.class"));
//System.out.println(context.getBean(Person.class));
System.out.println(context.getBean("person4Qualifier"));





 
	}

}
