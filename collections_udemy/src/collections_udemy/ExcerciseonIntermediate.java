package collections_udemy;

import java.util.List;
import java.util.stream.IntStream;

public class ExcerciseonIntermediate {

	public static void main(String[] args) {
		IntStream.range(1,11).map(n->n*n*n).forEach(s->System.out.println(s));

		List.of("Areti","Best","cool","divya").stream()
		.map(s->s.toLowerCase())
		.forEach(n->System.out.println(n));
		List.of("parrot","Lion","Jungle","Jellyfish").stream().filter(f->f.startsWith("J")).
		map(g->g.length()).forEach(u->System.out.println(u));
		
	}

}
