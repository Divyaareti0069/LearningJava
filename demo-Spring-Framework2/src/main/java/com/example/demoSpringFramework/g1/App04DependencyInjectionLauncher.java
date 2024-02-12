package com.example.demoSpringFramework.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Service
class BusinessService{
	private DataService dataservice;
	
	public DataService getdataservice() {
		return dataservice;
	}
	@Inject
	public void setDataService() {
		System.out.println("setter injection invoked");
		this.dataservice=dataservice;
	}
	
}

@Named
class DataService{
	
	
}




@Configuration
@ComponentScan
public class App04DependencyInjectionLauncher {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(App04DependencyInjectionLauncher.class);

Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

System.out.println(context.getBean(BusinessService.class));




 
	}

}
