package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize window
		driver.manage().window().maximize();
		
		//to get the title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		//close the browser
		driver.close();
		

	}

}
