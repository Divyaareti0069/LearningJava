package multithreading;

public class ParallelExecution extends Thread {
	
	int number;
	ParallelExecution(int number){
		this.number=number;
	}
	
	public void run() {
		System.out.println("task"+number+" started");
		for(int i=number*100;i<number*100+99;i++) {
			System.out.println(i);
			
		}
		System.out.println("task"+number+" ended");
	}
}
	

	
	
	

	


