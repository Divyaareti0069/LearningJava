package collect;

import java.util.*;  
public class ArrayListExample{  
 public static void main(String args[]){  
  ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(1);
  al.add(0,2);
  al.add(3);
  al.add(5);
  al.add(7);
  System.out.println(al);
  System.out.println(al.contains(9));
  System.out.println(al.indexOf(5));
  
  Iterator itr=al.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  al.removeAll(al);
  System.out.println(al);
  
  
 }  
}  