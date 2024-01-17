package concepts;

public class ThisContinution {
	ThisContinution (){
		System.out.println("this keyword from constructor");
		
	}
	void This(String name) {
		this();
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		
		ThisContinution t=new ThisContinution ();
		t.This("divya");
	}

}
