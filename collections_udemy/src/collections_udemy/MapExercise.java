package collections_udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExercise {

	public static void main(String[] args) {
	/*	List<String> l=Arrays.asList("Areti","Best","cool","Dodge","elegant","friendly");
		
		  Set<String> UpperCase= l.stream() .map(n->n.toUpperCase())
		  .collect(Collectors.toSet()); System.out.println(UpperCase);
		 
		l.stream().map(n->n.length()).forEach(len->System.out.println(len));
	}*/
	
	/*
	 * List<Integer> l2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	 * 
	 * List<Integer> MultipliedList=l2.stream() .filter(n->n%3==0) .map(m->m*3)
	 * .collect(Collectors.toList()); System.out.println(MultipliedList);
	 */
	List<Stock> StockList=Arrays.asList(
			new Stock(1,"Stock1",670f),
			new Stock(1,"Stock1",490f),
			new Stock(1,"Stock1",520f),
			new Stock(1,"Stock1",840f)
			);
	
	List<Float> StockVal=StockList.stream().filter(k->k.price>500f).map(n->n.price).collect(Collectors.toList());
	System.out.println(StockVal);
	}

}
