package collections_udemy;

import java.util.HashMap;
import java.util.Map;
//to find the occurences of the characters/words in astring
public class MapExample {

	public static void main(String[] args) {
		String str="This is an example"+"you have to write this";
		Map<Character,Integer> m=new HashMap<>();
		
		char[] characters=str.toCharArray();
		for(char c:characters) {
			Integer i=m.get(characters);
			if(i==null) {
				m.put(c,1);
				
			}else {
				m.put(c,i+1);
			}
		}
System.out.println(m);
	}

}
