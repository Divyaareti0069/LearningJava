package multithreading;

public class ThreadName implements Runnable {
	@Override
	public void run() {
		System.out.println("run method...");
	}


	public static void main(String[] args) {
		Runnable r=new ThreadName();
		Thread t1=new Thread(r,"my new Thread");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
	}

	
}
