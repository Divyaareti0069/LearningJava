package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService e=Executors.newFixedThreadPool(4);
		List<CallableRunner> tasks=List.of(new CallableRunner("divya"),new CallableRunner("Areti"),new CallableRunner("GVSU"),new CallableRunner("darjeling"));
		//List<Future<String>> results=e.invokeAll(tasks);
		String Fastest=e.invokeAny(tasks);
		//for(Future<String> r:results) {
			//System.out.println(r.get());
			
		System.out.println(Fastest);
		e.shutdown();
		
	}

}
