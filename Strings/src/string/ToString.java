package string;

public class ToString {
  int id;
  String name;
  String dob;
  
	public ToString(int id, String name, String dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}
	
	public String toString() {
		return id+" "+name+" "+dob;
	}

	public static void main(String[] args) {
		ToString t1=new ToString(1,"divya","2612");
		System.out.println(t1.toString());
		
		

	}

}
