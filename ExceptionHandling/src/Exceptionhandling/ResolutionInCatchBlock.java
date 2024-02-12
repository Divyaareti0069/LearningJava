package Exceptionhandling;

public class ResolutionInCatchBlock {

	public static void main(String[] args) {
	int i=25;
	int j=0;
	try {
		System.out.println(i/j);
	}catch(ArithmeticException e) {
		int j2=50/0;
		System.out.println(j2);
		System.out.println(i/(j+2));
		
	}

	}

}
