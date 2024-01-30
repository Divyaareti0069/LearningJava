package collect;

public class Faculty implements Comparable {
	
String name;
int salary;
String college_name;
	

	public int compareTo(Faculty f) {
		if(salary>f.salary) {
			return 1;
		}if(salary<f.salary) {
			return -1;
		}
		
		return 0;
	}


	public Faculty(String name, int salary, String college_name) {
		super();
		this.name = name;
		this.salary = salary;
		this.college_name = college_name;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
