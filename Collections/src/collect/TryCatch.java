package collect;

public class TryCatch {
	
	public static void main (String args[]) {
		try {
			String s=null;
			System.out.println(s.length());
			int a[]={3,4,5,7};
			a[10]=9/0;
			int i=50/0;
		}
			
			
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	System.out.println("code after error");
	}
	
	

}
