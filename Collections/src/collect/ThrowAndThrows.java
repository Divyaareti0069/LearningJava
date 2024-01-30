package collect;

public class ThrowAndThrows {
	
	int division(int num) throws ArithmeticException{
		for(int i=0;i<10;i++) {
			if(num%i==0) {throw new ArithmeticException("cannpt accept odd numbers");
			
			}
			
			
		}
	 return num;
		
		
	}

	public static void main(String[] args) {
		
		ThrowAndThrows t=new ThrowAndThrows();
		try {
			t.division(2);
		}catch(Exception e) {
			System.out.println("exception ocuured");
			System.out.println(e.getMessage());
		}
		

	}

}
