package locators;
import java.util.*;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocator 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		for(WebElement link :links)
		{
			System.out.println(link.getText());
		}
		
		driver.quit();
		

	}

}
