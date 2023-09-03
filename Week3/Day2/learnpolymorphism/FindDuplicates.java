package week3.day2.learnpolymorphism;

public class FindDuplicates {
	public static void main(String[] args) {

		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};

		//output = 2,5,7

		//Iterate through an outer for loop
		for (int i = 0; i < nums.length; i++) {
			//Iterate through an inner loop
			for (int j = i+1; j < nums.length; j++) {
				// compare both variables
				//if it is equal 
				if (nums[i]==nums[j]) {
					//print the array value
					System.out.println(nums[i]);
				}

			}

		}
	}

}
