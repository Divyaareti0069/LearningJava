package string;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {
		String s1="hello string";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			
		}
		System.out.println(Arrays.toString(ch));
	}

}
