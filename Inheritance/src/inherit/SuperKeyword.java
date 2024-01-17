package inherit;

public class SuperKeyword {
	//String name="super: in parent class";
	public void Calculation() {
		System.out.println("calculation in : parent class");
		
	}
	
	public static void main(String[] args) {
		SuperChild s= new SuperChild ();
		s.Calculation();

	}

	

}
