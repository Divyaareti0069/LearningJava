package string;

public class StringBufferExample {

	

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("String Buffer is thread safe ");
		System.out.println(sb1.append("buffer"));
		System.out.println(sb1.reverse());
		System.out.println(sb1.capacity());
		System.out.println(sb1.replace(1, 4,"Strings"));
		System.out.println(sb1.delete(1, 5));
		sb1.ensureCapacity(40);
		
		
		
		

	}
	
	

}
