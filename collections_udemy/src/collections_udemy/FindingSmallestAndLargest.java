package collections_udemy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingSmallestAndLargest {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(01,12,23,34,45,56,67,78,89,90);
		Optional<Integer> second_smallest=l.stream().sorted().skip(1).findFirst();
		System.out.println(second_smallest);
		Optional<Integer> second_largest=l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(second_largest);
		

	}

}
