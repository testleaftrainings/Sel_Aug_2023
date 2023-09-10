package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {
	
	public static void main(String[] args) {
		//h5[text()='Sweet Alert (Simple Dialog)']/following::span
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
