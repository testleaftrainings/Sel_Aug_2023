package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show button
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span")).click();
		//switch the control to the alert
		Alert confirmAlert = driver.switchTo().alert();
		//read the alert message/text
		String alertMsg = confirmAlert.getText();
		System.out.println("Alert message :"+alertMsg);
		confirmAlert.dismiss();	
		//verify
		String text = driver.findElement(By.id("result")).getText();
		if (text.contains("Cancel")) {
			System.out.println("Alert is dismissed");
		}
		


	}

}
