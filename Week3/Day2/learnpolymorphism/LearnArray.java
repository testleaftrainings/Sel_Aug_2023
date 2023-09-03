package week3.day2.learnpolymorphism;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[] args) {
		int[] nums = {98,87,90,99,92};
		//reverse them
		Arrays.sort(nums);// 87,90,92,98,99
		//iterate through a for loop
		for (int i = nums.length-1; i >=0; i--) {
			System.out.println(nums[i]); //scores[4]=99,scores[3]=98,scores[2]=92,scores[1]=90,scores[0]=87
		}
		
		int[] marks = new int[5];
		marks[0]=20;
		marks[1]=23;
		marks[2]=21;
		marks[3]=22;
		marks[4]=24;
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	}

}
