package inherit;

public class Sum {
	
	static int add(int a,int b) {
		
		return a+b;
		
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static double add(double a,double b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.add(30, 40));
		System.out.println(s.add(20, 30));
		System.out.println(s.add(5, 6, 7));
		

	}

}
