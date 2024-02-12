package collections_udemy;

import java.util.List;

public class ReduceStream {

	public static void main(String[] args) {
		
		List<Integer> l=List.of(1,2,3,4,5,6,7,8,9,10);
		l.stream()
		.forEach(i->System.out.println(i));
		
		
		int sum=l.stream()
				.filter(i->i%2==1)
				.reduce(0,(num1,num2)->num1+num2);
		
		System.out.println(sum);
		
		

	}

}
