package multithreading;

import java.util.concurrent.Callable;

public class CallableRunner implements Callable<String>{
 String name;
 public CallableRunner(String name) {
	 this.name=name;
 }

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "hello   " +name;	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
