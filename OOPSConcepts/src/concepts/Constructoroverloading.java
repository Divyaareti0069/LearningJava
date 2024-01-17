package concepts;

public class Constructoroverloading {
	int id;
	String name;
	int age;
	
	Constructoroverloading(int i,String n){
		id=i;
		name=n;
	}
	Constructoroverloading(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	 void display() {
		 System.out.print(id+" "+name+" "+age);
	 }

	public static void main(String[] args) {
		Constructoroverloading c1=new Constructoroverloading(1,"divya");
		Constructoroverloading c2=new Constructoroverloading(2,"deepika",25);
		c1.display();
		System.out.println();
		c2.display();
	}

}
