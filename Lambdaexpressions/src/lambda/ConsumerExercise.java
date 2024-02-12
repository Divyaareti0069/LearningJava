package lambda;

import java.util.function.Consumer;

public class ConsumerExercise {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("divya");
		
		
	}

}
