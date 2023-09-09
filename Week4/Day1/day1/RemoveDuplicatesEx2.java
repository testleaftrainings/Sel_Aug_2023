package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesEx2 {
	public static void main(String[] args) {
		String str = "Google";
		str=str.toLowerCase();
		//output=gole
		//convert given String into charArray
		char[] ch = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (char eachChar : ch) {
			set.add(eachChar);
		}
		System.out.println(set);
		
		String output = "";
		for (char each : set) {
			output=output+each;
		}
		System.out.println(output);
		
	}

}
