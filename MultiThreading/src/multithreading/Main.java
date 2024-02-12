package multithreading;

public class Main {

		public static void main(String[] args) throws InterruptedException {
			
			ParallelExecution p=new ParallelExecution();
			p.start();
			p.setPriority(6);
			RunnableInterface r2=new RunnableInterface();
			Thread t2=new Thread(r2);
			t2.start();
			t2.setPriority(6);
			
			t2.join();
			
			t2.yield();
			
			System.out.println("task3 started");
			for(int i=200;i<299;i++) {
				System.out.println(i);
				
			}
			System.out.println("task3 ended");
		}
	}
		
		


