package collect;

import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(2);
		v.add(35);
		v.add(49);
		v.add(23);
		v.remove(23);
		System.out.println(v.size());
		java.util.Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		

	}

}
