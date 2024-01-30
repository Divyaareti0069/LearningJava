package collect;

import java.util.*;

public class Linkedlist {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("divya");
		ll.add(0, "deepika");
		ll.add("harika");
		ll.add("ramya");
		ll.add("divya");
		ll.add("harika");
		
		ll.remove(2);

		Iterator<String> itr = ll.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********");
		System.out.println(ll.peekFirst());
		ll.pollLast();
		ll.retainAll(ll);
		System.out.println(ll);
		System.out.println("*********");
		System.out.println(ll.get(1));
		

		ll.clear();
		System.out.println(ll.isEmpty());
	}

}