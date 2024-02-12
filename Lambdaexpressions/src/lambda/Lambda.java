package lambda;
//examples:Runnable->run,Callable->call,Comparable->compareTo,ActionListener->ActionPerformed
//implementation of functional interfaces
//java.util.function->Predicate,Consumer,Supplier,Function
@FunctionalInterface
interface Cab{
	String bookCab(String pickup,String dropoff);
}




public class Lambda {
	/*
	 * //(a,b)->System.out.println(a+b);
	 * 
	 * //n-> n*n;
	 */
public  static void main(String[] args) {
		
Cab c=(p,d)->{
	System.out.println("Ola is booked from "+p+" to "+d);
	return "30$";
};
System.out.println(c.bookCab("hyd","Mumbai"));


	}

}
