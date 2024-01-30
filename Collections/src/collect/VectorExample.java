package collect;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(5);
		v.addElement(1);
		v.add(2);
		v.add(2);
		v.insertElementAt(3,3);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.indexOf(2));
		v.removeElementAt(2);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.hashCode());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}
	
	}
	        
	   
