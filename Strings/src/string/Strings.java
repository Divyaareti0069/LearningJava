package string;
import java.lang.String;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1=" learn java ";
		char ch[]={'d','i','v','y','a'};
		String string4=new String("Learn java");
		String string3=new String("new String created with object");
		String string2=new String(ch);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println (string2.charAt(3));
		System.out.println(string1.compareTo(string4));
		System.out.println(string1.compareToIgnoreCase(string4));
		System.out.println(string1.contentEquals(string4));
		System.out.println(string1.concat(string2));
		System.out.println(string3.startsWith("new"));
		System.out.println(string2.endsWith("ya"));
		System.out.println(string1.equals(string4));
		System.out.println(string1.equalsIgnoreCase(string4));
		System.out.println(string1.indexOf('r'));
		System.out.println(string1.indexOf("learn java"));
		System.out.println(string1.lastIndexOf('a'));
		System.out.println(string3.indexOf('c',13));
		System.out.println(string1.isEmpty());
		System.out.println(string1.toUpperCase());
		System.out.println(string4.toLowerCase());
		System.out.println(string1.trim());
		System.out.println(string1.substring(3));
		System.out.println(string1.substring(3, 7));
		//System.out.println(s1.split("n"));
		System.out.println(string2.replace('v','b'));
		String major="My major is Applied Computer Science";
		System.out.println(major.replace("Applied Computer Science", "Data Science"));
		
		System.out.println(string3.length());
		System.out.println(string1==string4);

	}

}

