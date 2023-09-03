package week3.day2.learnpolymorphism;

import java.util.Arrays;

public class LearnArrays {
	//ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		//     type[] variable={value};
		//index         0   1  2  3 4
		int[] scores = {98,97,76,87,90};

		//length of this array
		//For length->always the count starts from 1
		//For index-> count starts from 0

		//to find the total length of the given array
		int len = scores.length;
		System.out.println("The total length of this array is :"+len);

		//to retrieve a single item of this array
		System.out.println("Second data :"+scores[2]);

		// To sort an array      0  1  2  3  4
		Arrays.sort(scores);// 76,87,90,97,98

		//to retrieve a single item of this array
		System.out.println("Second data :"+scores[2]);
		
		//find the largest number of this array
		System.out.println("The largest number :"+scores[scores.length-1]);//scores[5-1]==scores[4]=98
		
		//find the least number of this array
		System.out.println("The least number: "+scores[0]);

		// to print all the items of an array
		//    i=0;i<5;i++
		for (int i = 0; i <scores.length; i++) {
			System.out.println(scores[i]);  //scores[0]=76 scores[1]=87 scores[2]=90 scores[3]=97 scores[4]=98 scores[5]=?
		}


	}
}
