package lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Customer{
	

		String cname;
		int cpurchase;
		
		Customer(String name,int purchase){
			cname=name;
			cpurchase=purchase;
			
		}
	

	public static void main(String[] args) {
		
		/*
		 * Function<String,Integer> i=j->j.length();
		 * System.out.println(i.apply("divs"));
		 * System.out.println(i.apply("java programming"));
		 */
		
		ArrayList<Customer> al=new ArrayList<>();
		al.add(new Customer("divya",22000));
		al.add(new Customer("sweety",25000));
		al.add(new Customer("areti",28000));
		Function<Customer,Integer> f=e->{
			int sal=e.cpurchase;
			if(sal>10000&&sal<25000)
				return sal*20/1000;
			if(sal>25000&&sal<30000)
				return sal*30/1000;
			else
				return sal*10/100;
		};
	
		
		Predicate<Integer> h=i->i>2000;
		
		for(Customer c:al) {
			int bonus=f.apply(c);
			if(h.test(bonus)) {
				System.out.println(bonus+" " +c.cname);	
			}
		
			
				
			
		
		

	}
	}
}
