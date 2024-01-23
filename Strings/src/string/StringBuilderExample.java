package string;

public class StringBuilderExample {

	

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("divya");
		System.out.println(sb);
		
		
		System.out.println(sb.insert(2,"ACS"));
		System.out.println(sb.replace(2,5,"DS"));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.delete(2, 7));
	}

}
