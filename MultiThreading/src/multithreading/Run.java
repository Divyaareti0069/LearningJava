package multithreading;

public class Run extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			 Thread.sleep(7000);
			 System.out.println(i);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) {

		Run r1=new Run();
		Run r2=new Run();
		r1.run();
		r2.run();
		
	}

}
