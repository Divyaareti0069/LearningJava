package lambda;

import java.sql.Time;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Predicate<Type>,Function<T,R>,Consumer<T>,Supplier<R>
public class ConsumerChaining {

	public static void main(String[] args) {
Consumer<String> c1=f->System.out.println(f+" "+"is dancing");
Consumer<String> c2=f->System.out.println(f+" "+"is sleeping");
Consumer<String> c3=f->System.out.println(f+" "+"is working");
c3.andThen(c1).andThen(c2).accept("divya");

Supplier<Time> s=()->new Time(0);
System.out.println(s.get());


	}

}
