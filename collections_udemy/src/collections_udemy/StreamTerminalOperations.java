package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> min=i.stream().min((x,j)->{return x.compareTo(j);});
		System.out.println(min.get());
		Optional<Integer> max=i.stream().max((x,j)->{return x.compareTo(j);});
		System.out.println(max.get());
		Optional<Integer> reduce=i.stream().reduce((val,sum)->{return val+sum;});
		System.out.println(reduce.get());
		Object[] arr =i.stream().toArray();
		System.out.println(arr.toString());
		System.out.println(arr.length);
		for(Object v:arr) {
			System.out.println(v);
		}
	}
}
