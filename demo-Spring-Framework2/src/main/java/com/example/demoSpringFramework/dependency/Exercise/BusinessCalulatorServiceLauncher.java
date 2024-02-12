package com.example.demoSpringFramework.dependency.Exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


interface DataService{
	int[] retrieveData();
	
}
@Component
@Primary
class mongodbService implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
	
}

@Component
class mySQLdbService implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}
	
}

@Component
class BusinesscalculatorService {

	DataService dataservice;
	
	public BusinesscalculatorService(DataService dataservice) {
		this.dataservice=dataservice;
		
	}
	
	public int findMax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
		
	}
	
	
}





@Configuration
@ComponentScan
public class BusinessCalulatorServiceLauncher {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(BusinessCalulatorServiceLauncher.class);

Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

System.out.println(context.getBean(BusinesscalculatorService.class).findMax());





 
	}

}
