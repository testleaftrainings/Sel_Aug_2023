package week1.day1;

public class LearnSwitchCondition {
	
	public static void main(String[] args) {
		String browser = "edge";
		
		switch (browser) {
		case "chrome":System.out.println("Open Chrome Browser");break;
		case "edge":System.out.println("Open Edge Browser");break;
		case "firefox":System.out.println("Open Mozilla Browser");break;
		case "ie":System.out.println("Open Internet explorer Browser");break;
		default:System.out.println("Open Opera browser");break;
		}
	}

}
