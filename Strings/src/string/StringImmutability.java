package string;

public class StringImmutability {

	public static void main(String[] args) {
		String s1="solar";
		s1.concat("system");
		System.out.println(s1.replace("solar","space"));
		System.out.println(s1.indexOf('a', 0));
		
		System.out.println(s1);
		
		

	}

}
