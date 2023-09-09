package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,3,5,3,2,4,7,6,5};
		//Output=[2,3,4,5,6,7]
		Set<Integer> unique = new TreeSet<>();
		//to add items to a Set
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
		}

		System.out.println(unique);	


	}

}
