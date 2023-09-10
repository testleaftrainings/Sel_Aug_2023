package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomActivity {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame
		driver.switchTo().frame("iframeResult");
		//click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to the alert
		Alert alert = driver.switchTo().alert();
		//get the text of the alert
		String text = alert.getText();
		System.out.println(text);
		//accept the alert
		alert.accept();
		//verify
		String text2 = driver.findElement(By.id("demo")).getText();
		if (text2.contains("OK")) {
			System.out.println("Alert accepted");
		}
		


	}

}
