package collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stck=new Stack<Integer>();
		stck.push(3);
		stck.push(4);
		stck.push(3);
		stck.push(5);
		System.out.println(stck.empty());
		stck.pop();
		
		Object[] a = {1,2,3,4};
		stck.copyInto(a);
		System.out.println(Arrays.toString(a));
		stck.add(5);
		stck.add(7);
		System.out.println(stck.search(4));
		System.out.println(stck);
		
		System.out.println(stck.peek());
		
		Iterator itr=stck.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
