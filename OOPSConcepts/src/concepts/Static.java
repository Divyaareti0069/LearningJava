package concepts;

public class Static {
	int id;
	String name;
	static String college="GVSU";
	static void changeCollege() {
		college="UCM";
	}
	Static (int i, String n,String c){
		id=i;
		name=n;
		college=c;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Static s1=new Static(1,"div","GVSU");
		Static s2=new Static(2,"deepika","UCM");
		s1.display();
		s2.display();
	}

}
