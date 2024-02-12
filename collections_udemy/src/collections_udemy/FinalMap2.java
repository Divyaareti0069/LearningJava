package collections_udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinalMap2 {

	public static void main(String[] args) {
	List<Student> s1=new ArrayList<Student>();
	s1.add(new Student(1,"divya",'A'));
	s1.add(new Student(2,"Sweety",'A'));
	s1.add(new Student(3,"deepika",'A'));
	s1.add(new Student(4,"harika",'A'));
	
	List<Student> s2=new ArrayList<Student>();
	s2.add(new Student(11,"ramya",'A'));
	s2.add(new Student(21,"sahiti",'A'));
	s2.add(new Student(31,"sireesha",'A'));
	s2.add(new Student(41,"venu",'A'));
	
List<List<Student>> StudentsList=Arrays.asList(s1,s2);
List<Integer> id=StudentsList.stream()
.flatMap(j->j.stream())
.map(k->k.id)
.collect(Collectors.toList());
System.out.println(id);

List<String> names=StudentsList.stream()
.flatMap(j->j.stream())
.map(k->k.name)
.collect(Collectors.toList());
System.out.println(names);

List<Character> grades=StudentsList.stream()
.flatMap(j->j.stream())
.map(k->k.grade)
.collect(Collectors.toList());
System.out.println(grades);
	}

}
