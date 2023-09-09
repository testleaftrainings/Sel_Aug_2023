package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//to find links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		//to find the number of links
		int size = links.size();
		System.out.println("Total no:of links in this page  : "+size);

		//to retrieve  a particular link out of all links
		//		WebElement secondEleLink = links.get(2);
		//		String text = secondEleLink.getText();
		//		System.out.println(text);

		System.out.println(links.get(2).getText());

		//to print all links
		//		for (int i = 0; i <size; i++) {
		//			String text = links.get(i).getText();
		//			System.out.println(text);
		//		}

		// Declare a List
		List<String> list = new ArrayList<>();
		//use for each loop
		//      datatype    variable: data	
		for (WebElement each : links) {
			String text = each.getText();
			list.add(text);
		}
		//to sort a list
		Collections.sort(list);
		System.out.println(list);
	}

}
