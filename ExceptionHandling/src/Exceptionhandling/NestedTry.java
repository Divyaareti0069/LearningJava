package Exceptionhandling;

public class NestedTry {

	public static void main(String[] args) {
try {
	try {
		int[] a=new int[8];
		a[9]=7;
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	try {
		String s=null;
		System.out.println(s);
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
		System.out.println("inner catch2 statement");
	}
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
	
}
	}

}
