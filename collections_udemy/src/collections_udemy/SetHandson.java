package collections_udemy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetHandson {

	public static void main(String[] args) {
		
		List<Character> list= List.of('A','R','E','T','A','I');
		TreeSet<Character> t=new TreeSet<>(list);
		System.out.println(t);
		HashSet<Character> h=new HashSet<>(list);
		System.out.println(h);
		LinkedHashSet<Character> l=new LinkedHashSet<>(list);
		System.out.println(l);

	}

}
