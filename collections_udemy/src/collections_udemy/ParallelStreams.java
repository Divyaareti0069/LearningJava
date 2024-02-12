package collections_udemy;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Company> ps=Arrays.asList(
				new Company("capgemini",3400000),
				new Company("capgemini",4500000),
				new Company("capgemini",6700000),
				new Company("capgemini",8900000),
				new Company("capgemini",9400000),
				new Company("capgemini",6900000),
				new Company("capgemini",8200000)
				);
			ps.stream().filter(f->f.getturnover()>4000000).limit(4).forEach(s->System.out.println(s.name+" "+s.turnover));
			System.out.println("****************");
			ps.parallelStream().filter(g->g.getturnover()>6000000).limit(3).forEach(s->System.out.println(s.name+" "+s.turnover));
			System.out.println("++++++++++++++++++++++");
			ps.stream().parallel().filter(u->u.getturnover()>8000000).limit(2).forEach(v->System.out.println(v.name+" "+v.turnover));
	}

}
