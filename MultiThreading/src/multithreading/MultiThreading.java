package multithreading;

public class MultiThreading {

	public static void main(String[] args) {
		
		for(int i=100;i<=199;i++) {
			System.out.println(i+" ");
		}
		
		System.out.println("loop1 completed");
		for(int i=200;i<=299;i++) {
			System.out.println(i+" ");
		}
		System.out.println("loop2 completed");
		for(int i=300;i<=399;i++) {
			System.out.println(i+" ");
		}
		System.out.println("loop3 completed");
		
		System.out.println("Main Loop completed");

	}
	

}
