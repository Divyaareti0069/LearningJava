package com.example.demoSpringFramework.dependency;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtypeClass{
	
}





@Configuration
@ComponentScan
public class BeanScopeLauncher {

	public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(BeanScopeLauncher.class);

Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
System.out.println(context.getBean(NormalClass.class));
System.out.println(context.getBean(NormalClass.class));
System.out.println(context.getBean(NormalClass.class));

System.out.println(context.getBean(ProtypeClass.class));
System.out.println(context.getBean(ProtypeClass.class));
System.out.println(context.getBean(ProtypeClass.class));
System.out.println(context.getBean(ProtypeClass.class));






 
	}

}
