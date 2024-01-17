package inherit;

public class IOContainer {
	
	void manage() {
		System.out.println("I/o container manages beans");
	}

	public static void main(String[] args) {
		
		ApplicationContext a= new ApplicationContext();
		a.application();
		a.manage();
		
	}

}
