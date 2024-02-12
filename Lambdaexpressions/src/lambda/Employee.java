package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee{
	String name;
	String gender;
	int salary;
	
	Employee(String name,String gender,int salary){
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		
	}



	public static void main(String[] args) {
		
		List<Employee> al=Arrays.asList(
				new Employee("Divya","f",75000),
				new Employee("Deepika","f",65000),
				new Employee("rahul","m",35000),
				new Employee("ravindra","m",32000)
				);
				

		Function<Employee,Integer> f= i->i.salary*10/100;
			
		
		Predicate<Integer> p=k->k>5000;
		Consumer<Employee> c=j->{System.out.println(j.gender);
		System.out.println(j.name);
		System.out.println(j.salary);
		
		};
		
		for(Employee e:al) {
			int bonus=f.apply(e);
			if(p.test(bonus)) 
				c.accept(e);
					
		}
		
		
	
	}
}
	
	

