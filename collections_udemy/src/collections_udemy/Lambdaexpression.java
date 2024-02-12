package collections_udemy;

import java.util.List;

public class Lambdaexpression {

	public static void main(String[] args) {
		List<Integer> l=List.of(1,2,3,4,5,6);
		List<String> s=List.of("apple","divya","coding","studying","deepika","eagle");
		

		s.stream()
		.filter(element->element.endsWith("le"))
		.forEach(element->System.out.println(element));
		l.stream()
		.filter(element->element%2==0)
		
		.forEach(element->System.out.println(element));
		
	}

}
