package collect;

import java.util.Hashtable;

public class HashTableExample{

	public static void main(String[] args) {
		Hashtable<Integer,String> hash=new Hashtable<Integer,String>();
		hash.put(1,"divya");
		hash.put(2,"deepika");
		hash.put(3,"harika");
		hash.put(4,"ramya");
		hash.put(5,"sweety");
		hash.remove(3);
		hash.remove(4);
		hash.containsKey(3);
		hash.putIfAbsent(2,"divya");
		System.out.println(hash);
		System.out.println(hash.getOrDefault(4,"not found"));
		System.out.println(hash.clone());
		System.out.println(hash.equals(hash));
		System.out.println(hash.elements());
		
	System.out.println(hash.clone());
	System.out.println(hash.get("sweety"));
	System.out.println(hash.getClass());
	System.out.println(hash.entrySet());
	hash.remove(hash);
	System.out.println (hash.toString());
		
	System.out.println(hash);
		

	}

}
