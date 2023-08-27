package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		
		//Load the url
		driver.get("https://login.salesforce.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//apply implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Java@223");
		
		//click on the Login button
		driver.findElement(By.id("Login")).click();
		
		//getTitle
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//click togglebutton
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		
		
		
		
		
		
	}

}