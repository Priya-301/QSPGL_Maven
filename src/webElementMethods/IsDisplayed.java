package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement logo=driver.findElement(By.xpath("//*[name()='svg' and contains(@class,'r-19wmn03')]"));
		 if(logo.isDisplayed())
		 {
			 System.out.println("Welcome page displayed");
		 }
		 else
			 
			 System.out.println("Welcome page displayed");
		 
		 driver.quit();

	}

}
