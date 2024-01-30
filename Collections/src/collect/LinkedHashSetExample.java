package collect;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
int id;
String name;
float salary;
String employeer; 


	public LinkedHashSetExample(int id, String name, float salary, String employeer) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.employeer = employeer;
}

	public static void main(String[] args) {
		
		LinkedHashSet <LinkedHashSetExample> lhs=new LinkedHashSet();
		LinkedHashSetExample l1=new LinkedHashSetExample(1,"divya",10500f,"capgemini");
		LinkedHashSetExample  l2=new LinkedHashSetExample (2,"deepika",85000f,"leadsquared");
		LinkedHashSetExample l3=new LinkedHashSetExample(3,"harika",90000f,"cognizant");
		
		lhs.add(l1);
		lhs.add(l2);
		lhs.add(l3);
		
		
		lhs.remove(l3);
		System.out.println(lhs.contains(l3));
		for(LinkedHashSetExample s:lhs) {
			System.out.println(s.id+" "+s.name+" "+s.salary+" "+s.employeer);
		}
		
		LinkedHashSet<Integer> l=new LinkedHashSet();
		l.add(9);
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		l.add(0);
		
		l.add(4);
		
		l.remove(5);
		l.remove(9);
	
		for(Integer i:l) {
			System.out.println(i);
		}

	}

}
