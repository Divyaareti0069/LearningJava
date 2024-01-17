package inherit;

public class Animal {
	
	void walk() {
		System.out.println("animal is walking");
	}

	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.walk();
		Animal a2=new Cat();
		a2.walk();
		
		
		

	}

}
