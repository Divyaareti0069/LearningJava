package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
java.util.concurrent.ExecutorService e=Executors.newFixedThreadPool(3);
/*
 * e.execute(new ParallelExecution()); e.execute(new Thread(new
 * RunnableInterface())); System.out.println("task3 started"); for(int
 * i=200;i<299;i++) { System.out.println(i);
 * 
 * } System.out.println("task3 ended");
 */

/*
 * e.execute(new ParallelExecution(1)); e.execute(new ParallelExecution(2));
 * e.execute(new ParallelExecution(3)); e.execute(new ParallelExecution(4));
 * e.execute(new ParallelExecution(5)); e.execute(new ParallelExecution(6));
 * e.execute(new ParallelExecution(7)); e.execute(new ParallelExecution(8));
 * e.execute(new ParallelExecution(9)); e.execute(new ParallelExecution(10));
 * e.execute(new ParallelExecution(11)); e.execute(new ParallelExecution(12));
 * e.execute(new ParallelExecution(13)); e.shutdown();
 */

Future<String> WelcomeMessage=e.submit(new CallableRunner("first execution"));
String s=WelcomeMessage.get();
System.out.println(s);

	}

}
