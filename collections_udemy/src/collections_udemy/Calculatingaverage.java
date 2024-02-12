package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Calculatingaverage {

	public static void main(String[] args) {
		
			    List<Integer> i=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			    Optional<Integer> sum_of_even=i.stream()
			    		.filter(n->n%2==0)
			    		.reduce((value,sum)->(value+sum));
			    System.out.println(sum_of_even);
			    
			    Optional<Integer> sum_of_odd=i.stream()
			    		.filter(n->n%2!=0)
			    		.reduce((value,sum)->(value+sum));
			    System.out.println(sum_of_odd);
			  }
			 
			  
			

	}


