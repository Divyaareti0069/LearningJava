package collect;

public class UncheckedExceptions {

	public static void main(String[] args) {
		try {
			int a=100/0;	
			int arr[]=new int[5];
			arr[10]=60;
			String s="abs";
			Integer i=Integer.parseInt(s);
			
			
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		
		



	}

}
