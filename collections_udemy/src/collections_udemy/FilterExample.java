package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
	List<String> a=Arrays.asList("Apple",null,"Bananas","Grapes","Dodge",null,"Pineapple","pomegranate");
	//List<String> l=
			//a.stream().filter(b->b.length()>6&&b.startsWith("p")).forEach(System.out::println);
			a.stream().filter(c->c!=null).forEach(System.out::println);
	//System.out.println(l);
	}

}
