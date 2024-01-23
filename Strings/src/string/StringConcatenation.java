package string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {

	public static void main(String[] args) {
		int i=40;
		String firstname="divya";
		String lastname="areti";
		String s=firstname+lastname;
		System.out.println(firstname.concat(lastname));
		System.out.println(s);
		String s1=s+26+12;
		String s2=10+15+s;
		System.out.println(s1);
		System.out.println(s2);
		StringBuilder builder1=new StringBuilder("Immutable");
		StringBuilder builder2=new StringBuilder("Strings");
		String join=String.join("",builder1,builder2);
		System.out.println(join);
		
		System.out.println(builder1.append(builder2));
		
		String format1="concatenating strings";
		String format2="with format method";
		String format= String.format("%s %s",format1,format2);
		System.out.println(format);
		StringJoiner j=new StringJoiner(" ,");
		j.add("joining the strings");
		j.add("using the new joiner class");
		System.out.println(j);
		String education="My major is computer Science";
		String [] split=education.split("/.");
		System.out.println(split);
		
		String Value=String.valueOf(i);
		System.out.println(Value+30);
		
		
		
		String intern=s1.intern();
		System.out.println(intern);
	}

}
