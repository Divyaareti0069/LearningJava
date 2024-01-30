package collect;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"divya");
		hm.put(1,"deepika");
		hm.put(2,"harika");
		hm.put(null,"triveni");
		hm.put(4, null);
		hm.put(5,null);
		System.out.println("after adding elements in the map");
		hm.remove(5);
		System.out.println("iterating.......");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(3,"ramya");
		hm.putAll(hm);
		System.out.println (hm.containsKey(2));
		hm.replace(1,"deepika","sweety");
		
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		hm.remove(2,"harika");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.replaceAll((k,v)->"divya");
		System.out.println("after replacing all");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" " +m.getValue());
		}
		

	}

}
