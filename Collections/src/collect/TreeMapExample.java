package collect;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer,Integer> n=new TreeMap<Integer,Integer>();
		n.put(2,null);
		n.put(3,27);
		n.put(4,24);
		n.put(1,25);
		n.put(1,26);
		n.put(2,28);
		for(Map.Entry m:n.entrySet()) {
			System.out.println(m.getKey()+" " +m.getValue());	
		}
	
		
		System.out.println(n.descendingMap());
		
		System.out.println(n.headMap(4));
		System.out.println(n.tailMap(3));
		System.out.println(n.subMap(2,4));
		
		

	}

}
