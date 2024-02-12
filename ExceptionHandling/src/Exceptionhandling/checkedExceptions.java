package Exceptionhandling;

//checked Exceptions-FileNotFoundException,InterruptedException,IOException

public class checkedExceptions {

	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("Program started");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program is completed");
	}
	

}
