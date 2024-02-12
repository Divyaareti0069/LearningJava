package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

//takes a parameter and return boolean value
//checks the conditions

class Employee{
	String ename;
	int salary;
	int experience;
	Employee(String name,int sal,int exp){
		ename=name;
		salary=sal;
		experience=exp;
	}
}

public class PredicateExercise {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(2));
		
		Predicate<String> s=x->(x.length()>4);
		System.out.println(s.test("bestest"));
		
		String[] arr= {"firstname","lastname","middlename","surname"};
		for(String n:arr) {
			if(s.test(n)) {
				System.out.println(n);
			}
		}
				
		Predicate<Employee> e=u->(u.salary>30000&&u.experience>2);
		
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("divs",85000,5));
		al.add(new Employee("deeps",65000,3));
		al.add(new Employee("harika",45000,2));
		
		for(Employee t:al) {
			if(e.test(t)) {
				System.out.println(t.ename+" "+t.salary);
			}
				
		
				
		}
			
		}
		
	}
	



