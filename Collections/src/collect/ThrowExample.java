package collect;

public class ThrowExample {

	
		public static void validateVote(int age) {
			if(age<18)
				throw new ArithmeticException("not eligible for voting");
			else
				System.out.println("eligible for voting");
		}
		public static void main(String[] args) {
	validateVote(21);
}
	}


