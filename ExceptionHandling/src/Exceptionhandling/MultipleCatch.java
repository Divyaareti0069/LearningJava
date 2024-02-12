package Exceptionhandling;

public class MultipleCatch {
	public static void main(String[] args) {

	int a[] = new int[6];
	try {
		a[7]=34/0;
		System.out.println(a[10]);
	} catch (ArithmeticException e) {
		System.out.println("element cannot be zero");
	} catch (ArrayIndexOutOfBoundsException f) {
		System.out.println("array index not exists");
		
	}
	System.out.println("in main method");
	

	}
}

	
		
		


	


