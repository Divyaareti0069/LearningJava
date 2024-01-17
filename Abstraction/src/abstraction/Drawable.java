package abstraction;

public interface Drawable {
	
	default void msg() {
		System.out.println("default method");
	}
	
	void draw();

}
