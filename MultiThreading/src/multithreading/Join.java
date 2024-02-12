package multithreading;

public class Join extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(200);
				System.out.println(i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Join j1=new Join();
		Join j2=new Join();
		Join j3=new Join();
		j1.start();
		try {
			j1.join(1500000000);
		}catch(Exception e) {
			System.out.println(e);
		}
		/*
		 * j2.start(); try { j2.join(300);
		 * System.out.println(Thread.currentThread().getName()); }catch(Exception e) {
		 * System.out.println(e); } j3.start();
		 */
		j2.start();
		j3.start();
		
	}

}
