package collect;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<College> al=new ArrayList<College>();
		College gvsu=new College(1,"GVSU","SATYA",45000);
		College ucm=new College(2,"UCM","SATISH",35000);
		College UNT=new College(3,"UNT","OMK",25000);
		al.add(UNT);
		al.add(0,gvsu);
		al.add(ucm);
		ArrayList<Integer> a2=new ArrayList<Integer>(5);
		a2.add(4);
		a2.add(8);
		a2.add(6);
		a2.add(10);
		a2.add(2,2);
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println("after sorting:"+a2);
		a2.trimToSize();
		System.out.println(a2);
		a2.ensureCapacity(15);
		a2.set(2,12);
		System.out.println (a2.isEmpty());
		System.out.println(a2.size());
		
		for(int index=0;index<a2.size();index++) {
			System.out.println(index);
		}
		
		for(College c:al) {
			System.out.println(c.id+" "+c.director+" "+c.name+" "+c.studentCount);
		}
		
		
	}

}
