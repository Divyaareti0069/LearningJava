//Aggregation
package inherit;

public class Employee {
	int id;
	String salary;
	Address address;
	
	Employee(int id, String salary,Address address){
		this.id=id;
		this.salary=salary;
		this.address=address;
	}
	
	void display() {
		System.out.println(id+" "+salary);
		System.out.println(address.country+" "+address.state+" "+address.street);
	}
	
	

	public static void main(String[] args) {
		Address a1=new Address("India","AP","kovela");
		Address a2=new Address("India","steamer","AP");
		Employee e1=new Employee(1,"divya",a1);
		Employee e2=new Employee(1,"divya",a2);
		
		e1.display();
		System.out.println(e2.address.country);

	}

}
