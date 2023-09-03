package week3.day2.learnpolymorphism;

import java.util.Arrays;

public class FindDuplicatesSimpleMethod {
	public static void main(String[] args) {

		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};

		//output = 2,5,7
        Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
			System.out.println(nums[i]);	
			}
		}
	}

}
