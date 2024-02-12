package collections_udemy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExercise {

	public static void main(String[] args) {
		
		class EvenPredicate implements Predicate<Integer>{

			

			public boolean test(Integer number) {
				return number%2==0;
			}
	
		}
		
		class EvenForEach implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		}
		
		class EvenMap implements Function<Integer,Integer>{

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
			
			
		}
		List.of(1,2,3,4,5,6,7,8,9,10).stream()
		
		.filter(new EvenPredicate())
		.map(new EvenMap())
		.forEach(new EvenForEach());
		
	}

}
