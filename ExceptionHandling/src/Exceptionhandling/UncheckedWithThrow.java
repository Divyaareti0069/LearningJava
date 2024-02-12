package Exceptionhandling;

public class UncheckedWithThrow {

	
		
		void validate(int age) {
			if(age<21) 
			throw new ArithmeticException("not eligible for voting");
		else 
			System.out.println("eligible to vote");
		
			public static void main(String[] args) {
				validate(14);
				System.out.println("rest of the code");
				
			}
		
		
	}

}

