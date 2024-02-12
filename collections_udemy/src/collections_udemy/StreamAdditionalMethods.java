package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdditionalMethods {

	public static void main(String[] args) {
		List<String> opposites=Arrays.asList("sun","first","last","above","arrow","below","steep","tip");
		Stream<String> stream1=opposites.stream();
		List<Integer> in=Arrays.asList(10,9,8,7,6,5,4,3,2,1);
		Stream<Integer> stream2=in.stream();
		List<Object>finallist=Stream.concat(stream1,stream2).collect(Collectors.toList());
		System.out.println(finallist);
		for(Object o:finallist) {
			System.out.println(o);
		}
		
		/*opposites.stream().sorted().forEach(System.out::println);
		List<String> ReverseOrder=opposites.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ReverseOrder);
		boolean a=opposites.stream().anyMatch(Value->{return Value.startsWith("a");});
		System.out.println(a);
		boolean  all=opposites.stream().allMatch(Value->{return Value.startsWith("a");});
		System.out.println(all);
		boolean none=opposites.stream().noneMatch(Value->{return Value.startsWith("a");});
		System.out.println(none);
		Optional<String> element=opposites.stream().findAny();
		System.out.println(element.get());
		
		  Optional<String> element1=opposites.stream().findFirst();
		  System.out.println(element1.get());*/
		 
	}

}
