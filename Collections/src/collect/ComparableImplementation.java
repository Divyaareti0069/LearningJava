package collect;

import java.util.ArrayList;

public class ComparableImplementation {

	public static void main(String[] args) {
		ArrayList<Faculty> al=new ArrayList<Faculty>();
		al.add(new Faculty("edward",50000,"GVSU"));
		al.add(new Faculty("damon",60000,"UCM"));
		al.add(new Faculty("Stefan",70000,"Bradley"));
		for(Faculty f:al) {
			System.out.println(f.name+" "+f.salary+" "+f.college_name);
		}
	}

}
