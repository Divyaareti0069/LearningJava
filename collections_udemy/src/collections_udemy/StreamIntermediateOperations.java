package collections_udemy;

import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		List<Integer> list=List.of(34,23,45,76,53,91,34,98);
		/*
		 * list.stream().distinct().sorted().map(n->n/2).filter(j->j%2==0)
		 * .forEach(e->System.out.println(e));
		 */
	
list.stream().distinct().forEach(System.out::println);
long count=list.stream().distinct().count();
System.out.println(count);
List<Integer>l=list.stream().limit(5).collect(Collectors.toList());
System.out.println(l);

	}
}
