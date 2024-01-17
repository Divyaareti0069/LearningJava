package concepts;

public class ConstructionOverloadingwiththis {
	int id;
	String name;
	String course;
	float fee;
	
	ConstructionOverloadingwiththis(int id,String name,String course){
		 this.course=course;
		 this.name=name;
		 this.id=id;
	 }
	 
	 ConstructionOverloadingwiththis(int id,String name,String course,float fee){
		 this(id,name,course);
		 this.fee=fee;
		 
	 }
	 
	 void display() {
		 System.out.println(id+" "+name+ " "+course+" "+fee);
	 }

	public static void main(String[] args) {
		ConstructionOverloadingwiththis c1= new ConstructionOverloadingwiththis(1,"divya","ACS",145f);
		ConstructionOverloadingwiththis c2= new ConstructionOverloadingwiththis(1,"divya","ACS");
		c1.display();
		c2.display();
	}

}
