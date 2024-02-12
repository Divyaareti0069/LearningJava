package Exceptionhandling;

public class Exception {
	
	
	/*
	 * String s=null; System.out.println(s.length()); String q="abcde"; int
	 * i=Integer.parseInt(q); System.out.println(i); int[] a=new int[6]; a[10]=0;
	 */

	public static void main(String[] args) {
		
		String s=null;
		try {
			
		//System.out.println("ERROR OCCURED");
		System.out.println(s.length());
		
			
	} 
		  catch(NullPointerException e) {
		  
		  System.out.println("String is not initialized");
		  
		  System.out.println("Exception handled");
		  
		  }
		 finally {
			System.out.println("final code");
		}
		
		int a[]= new int[9];
		try{
			a[10]=0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}



}
}
