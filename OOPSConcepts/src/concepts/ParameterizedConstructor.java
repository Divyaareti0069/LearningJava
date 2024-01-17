package concepts;

public class ParameterizedConstructor {
	int id;
	String name;
	ParameterizedConstructor(ParameterizedConstructor p1) {
		id=p1.id;
		name=p1.name;
	}
	
	
	ParameterizedConstructor(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+ " "+name);
	}
	public static void main(String[] args) {
	
		 ParameterizedConstructor p1=new  ParameterizedConstructor(1,"divya");
		 ParameterizedConstructor p2=new  ParameterizedConstructor(p1);
		
		 p1.display();
		 p2.display();
		
	}

}
