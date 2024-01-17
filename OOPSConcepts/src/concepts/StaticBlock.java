package concepts;

public class StaticBlock {
	static{
		System.out.println("static block invoked");
	}
	static int cube(int a) {
		int cube=a*a*a;
		return cube;
	}

	public static void main(String[] args) {
		StaticBlock s1=new StaticBlock();
		System.out.println(s1.cube(9));
		

	}

}
