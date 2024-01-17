package abstraction;

public interface Printable extends Drawable{
	
	static int cube(int x) {
		return x*x*x;
	}
	
	void print();

}
