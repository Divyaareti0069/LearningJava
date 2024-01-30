package collect;

import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new Map<Integer,String>();
		map.put(0,"divya");
		map.put(1, "deepika");
		map.put(0,"areti");
		map.putIfAbsent(2,"harika");
		System.out.println(map.entrySet());
		System.out.println (map.get("divya"));
		System.out.println(map.keySet());
		
		System.out.println(map.replace(1,"sweety"));
		System.out.println(map.remove(2));
		
		.sorted(Map.Entry.comparingByKey());
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
			

	}

}
