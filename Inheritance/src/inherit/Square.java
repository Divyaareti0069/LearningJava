package inherit;

public class Square extends Rectangle{
	void returnPerimeter() {
		int l=3,b=2;
		int perimeter=2*(l+b);
		System.out.println(perimeter);
		
		
		
	}
	
	
	public static void main(String args[]) {
		Square s=new Square();
		s.returnPerimeter();
		s.Returnarea();
		s.shape();
	}
	}
 

