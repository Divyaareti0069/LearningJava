package collect;

import java.io.IOException;

public class ExceptionHandlingWithMethodOverriding extends ParentClass {
	
	void msg() throws IOException{
		System.out.println("method in child");
	}
	

	public static void main(String[] args) {
		ParentClass p=new ExceptionHandlingWithMethodOverriding();
		p.msg();
		

	}

}
