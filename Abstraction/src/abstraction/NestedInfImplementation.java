package abstraction;

import abstraction.A.B;

public class NestedInfImplementation implements B{
	public void methodB() {
		System.out.println("implementing nested interface");
	}

	public static void main(String[] args) {
		
		A.B b=new NestedInfImplementation ();
		b.methodB();

	}

}
