package collect;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue();
		q.add(4);
		q.add(5);
		q.add(8);
		q.add(2);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		Iterator i=q.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		q.remove();
		System.out.println(q);
	}

}
