package week3.day2.learnpolymorphism;

public class LearnReplaceAll {
	
	public static void main(String[] args) {
		String str = "Chennai 600073";
		//output=600073
		String replaceAll = str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);//600073
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt);
		
		//output=Chennai
		String replaceAll2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll2);
		
		String str1 = "testleaf,2023";
		String replaceAll3 = str1.replaceAll(",", "");
		System.out.println(replaceAll3);
		
		String number = "9,017";
		String replaceAll4 = number.replaceAll(",", "");
		int parseInt2 = Integer.parseInt(replaceAll4);
		System.out.println(parseInt2);
		
		
	}

}
