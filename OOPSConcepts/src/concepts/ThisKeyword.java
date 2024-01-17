package concepts;

public class ThisKeyword {
	
 void printStudent() {
	 System.out.println("student name is divya");
	 
 }
 
 void printCollege() {
	 System.out.println("gvsu");
	 this.printStudent();
	 
 }
 
	
	

	public static void main(String[] args) {
		 ThisKeyword t1=new  ThisKeyword();
		 t1.printCollege();
	}

}
