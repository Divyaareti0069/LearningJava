package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExercise {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(2,3,4);
		List<Integer> l2=Arrays.asList(7,8,9);
		List<Integer> l3=Arrays.asList(13,14,15);
		List<List<Integer>> FinalList=Arrays.asList(l1,l2,l3);
				
	FinalList.stream().flatMap(x->x.stream()).map(n->n+10).forEach(System.out::println);
		
System.out.println(FinalList);
	}

}
