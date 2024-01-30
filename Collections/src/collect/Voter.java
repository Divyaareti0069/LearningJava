package collect;

import java.util.Set;

import java.util.TreeSet;

public class Voter implements Comparable<Voter>{
	int voterId;
	String voterName;
	String constitutionName;
	int age;
	

	public Voter(int voterId, String voterName, String constitutionName, int age) {
		
		this.voterId = voterId;
		this.voterName = voterName;
		this.constitutionName = constitutionName;
		this.age = age;
	}
	
	public int compareTo(Voter v) {
		if(voterId<v.voterId) {
			return -1;
		}
		if(voterId>v.voterId) {
			return 1;
		}else {
			return 0;
		}
	
		
	}


	public static void main(String[] args) {
		
		Set<Voter> s=new TreeSet<Voter>();
		Voter v1=new Voter(1,"divya","NSP",24);
		Voter v2=new Voter(2,"deepika","banglore",21);
		Voter v3=new Voter(3,"harika","hyd",25);
		Voter v4=new Voter(4,"ramya","pkl",26);
		s.add(v4);
		s.add(v1);
		s.add(v2);
		s.add(v3);
		s.remove(v4);
		System.out.println(s.contains(v3));
		
		
		for(Voter v:s) {
			System.out.println(v.voterId+" "+v.voterName+" "+v.age+" "+v.constitutionName);
		}
		
		
		
		
		
		

	}

}
