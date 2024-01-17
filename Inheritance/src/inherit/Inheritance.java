package inherit;

public class Inheritance extends Singlelevelinheritance{
	
	void b() {
		System.out.println("in child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance i= new Inheritance();
		i.b();
		i.a();


	}
}
