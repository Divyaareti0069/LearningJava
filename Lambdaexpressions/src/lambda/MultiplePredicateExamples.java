package lambda;
//write the conditions in predicates and use them anywhere 
import java.util.function.Predicate;

public class MultiplePredicateExamples {

	public static void main(String[] args) {
		
		int[] a= {12,23,34,45,56,67,78,89,90};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>=50;
		for(int i:a) {
			if(p1.test(i)&&p2.test(i)) {
				
				System.out.println(i);
			}
		}
		
		
		

	}

}
