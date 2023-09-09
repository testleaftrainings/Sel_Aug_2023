package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //type mobiles in the search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		//print all mobile prices
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//Declare a List
		List<Integer> list = new ArrayList<>();
		//to print 
		for (WebElement each : prices) {
			String text = each.getText();//13499
			String replacedString = text.replaceAll(",", "");
			int mobilePrices = Integer.parseInt(replacedString);
			list.add(mobilePrices);	
		}
		//to print unique mobile prices
		Set<Integer> unique = new TreeSet<>(list);
		if (list.size()!=unique.size()) {
			System.out.println("Duplicates Present");
		}
		else {
			System.out.println("No Duplicates");
		}
		System.out.println(unique);
		List<Integer> allList = new ArrayList<>(unique);
		System.out.println(allList.get(0));
		
		
	}

}
