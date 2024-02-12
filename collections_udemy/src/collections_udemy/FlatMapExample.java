package collections_udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> greetings=Arrays.asList("Hello","Hi","Namaste","Vannakam","Adaab");
		List<String> players=Arrays.asList("kohli","dhoni","rohit","shreyas");
		List<String> cartoons=Arrays.asList("tom","jerry","kid","ben10","simba");
		
		List<List<String>> collection=new ArrayList<>();
		collection.add(players);
		collection.add(greetings);
		collection.add(cartoons);
		
		
		  List<String>
		  l=collection.stream().flatMap(o->o.stream()).collect(Collectors.toList());
		  System.out.println(l);
		 
		System.out.println("***************");
		
		for(List<String> ls:collection) {
			for(String name:ls) {
				System.out.println(name);
			}
		}
		
		
	}

}
