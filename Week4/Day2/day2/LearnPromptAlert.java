package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show button
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		//switch the control to the alert
		Alert promptAlert = driver.switchTo().alert();
		//read the alert message/text
		String alertMsg = promptAlert.getText();
		System.out.println("Alert message :"+alertMsg);
		//pass input
		promptAlert.sendKeys("Subraja");
		//accept the alert
		promptAlert.accept();	
		//verify
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("Subraja")) {
			System.out.println("Input passed and accepted");
		}
		


	}

}
