package collections_udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		List<Stock> l=new ArrayList<Stock>();
				l.add(new Stock(1,"stock1",56.8f));
				l.add(new Stock(1,"stock2",72.3f));
				l.add(new Stock(1,"stock3",86.2f));
		
				l.add(new Stock(1,"stock4",96.2f));
				
				
				/*
				 * Set<Stock> StockSet=l.stream() .filter(i->i.price<90f) .limit(2) .map(j->j)
				 * 
				 * .collect(Collectors.toSet()); System.out.println(StockSet);
				 * 
				 * long count=StockSet.stream().filter(j->j.price>50f).count();
				 * System.out.println(count);
				 */
				
				/*
				 * Map<Integer,String>
				 * map=l.stream().collect(Collectors.toMap(p->p.id,p->p.name));
				 * System.out.println(map);
				 */
				
				List<Stock> l1=l.stream().filter(p->p.price>60f)
						.collect(Collectors.toList());
			
				
				System.out.println(l1);
				
						
				
	}

	
}
