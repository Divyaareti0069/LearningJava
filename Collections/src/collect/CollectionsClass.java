package collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
	


	public static void main(String[] args) {
		List<Integer> nums=new ArrayList();	
		nums.add(2);
		nums.add(4);
		nums.add(7);
		nums.add(1);
		nums.add(3);
		nums.add(5);
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		Integer[] i= {1,2,3,4};
		Collections.addAll(nums,i);
		Collections.addAll(nums,10,11,13,15,17,19,21);
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		System.out.println(nums);
		
		

	}

}
