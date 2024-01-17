package concepts;

public class Objectthroughmethod {
	
int id;
String name;
 void AdmitSudent(int i, String n) {
	 id=i;
	 name=n;
	 
 }
 
 void displayInfo() {
	 System.out.println(id + " " + name);
 }

	public static void main(String[] args) {
		Objectthroughmethod o1=new Objectthroughmethod();
		Objectthroughmethod o2=new Objectthroughmethod();
		
		o1.AdmitSudent(1,"divya");
		o2.AdmitSudent(2,"deepika");
		o1.displayInfo();
		o2.displayInfo();

	}

}
