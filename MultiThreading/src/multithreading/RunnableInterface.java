package multithreading;

public class RunnableInterface implements Runnable {

	

	@Override
	public void run() {
		System.out.println("task2 started");
		for(int i=100;i<199;i++) {
			System.out.println(i);
			
		}
		System.out.println("task2 ended");
	}
		
	}
	
	
		

	


