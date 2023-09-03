package week3.day2.learnpolymorphism;

public class LearnString {
	
	public static void main(String[] args) {
		//literal declaration
		String name="Testleaf";
		String name1="testleaf";
		//instantiation- String objects
		String str = new String("Testleaf");
		
		//to compare two String values
		//difference between == and .equals() 
		//== will check only for the references and it will not check the content inside a String
		//.equals() will compare the content of two Strings
		
		System.out.println(name==str);
		System.out.println(name.equals(str));
		System.out.println(name.equals(name1));
		
		//to compare two Strings ignoring case sensitivity
		System.out.println(name.equalsIgnoreCase(name1));
		
		//to find the length of a String
		int len = name.length();
		System.out.println("The total length is :"+len);
		
		//to check whether the part of the String exist or not
		System.out.println(name.contains("Test"));//
		
		//to lowercase
		name = name.toUpperCase();
		
		//toCharArray
		char[] ch = name.toCharArray();
		System.out.println(ch[2]);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//to print the substring
		String substring = name.substring(5);
		System.out.println(substring);
		
		String substring2 = name.substring(3, 6);
		System.out.println(substring2);
		
		
		
	}

}
