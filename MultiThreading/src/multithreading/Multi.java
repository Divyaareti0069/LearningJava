package multithreading;

//public class Multi extends Thread{
public class Multi implements Runnable{	
	
	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		
		Multi m=new Multi();
		Thread t1=new Thread(m);
		t1.start();
		t1.start();
	}

}
