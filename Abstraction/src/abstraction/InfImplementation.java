package abstraction;

public class InfImplementation implements Drawable,Printable{



	
	public void print() {
		System.out.println("printing the cube");
		
	}

	
	public void draw() {
		System.out.println("drawing the cube");
		
		
	}
	
	public void newMethod() {
		System.out.println("new method in the class");
	}
	public static void main(String[] args) {
		InfImplementation i=new InfImplementation();
		i.draw();
		i.print();
		i.newMethod();
		System.out.println(Printable.cube(7));
		
		

	
}
}
