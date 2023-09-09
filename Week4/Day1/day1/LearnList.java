package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare a List
		//List name<generic(Type)> listname = new implementationClass<>();
		List<String> mentors = new ArrayList<>();
		//to add items into a list
		mentors.add("Vidhya");
		mentors.add("Aravind");
		mentors.add("Ragu");
		mentors.add("Dilip");
		mentors.add(2, "Jagadeesh");
		mentors.add("Kathir");
		
		//find the size of List
		int size = mentors.size();
		System.out.println("List size is:"+size);
		
		//to print the list
		System.out.println(mentors);
		
		//to remove an item from a list
		mentors.remove(3);
		System.out.println(mentors);
		
		//to retrieve a particular item from a list
		String value = mentors.get(4);
		System.out.println(value);
		
		//to clear a list
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		
		
	}

}
