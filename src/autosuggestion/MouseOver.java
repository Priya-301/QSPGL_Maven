package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab=driver.findElement(By.id("course"));
		Actions actions=new Actions(driver);
		actions.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='selenium']")).click();
		WebElement quantity=driver.findElement(By.id("quantity"));
		
		int initialQuan=Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement plusButton=driver.findElement(By.id("add"));
		actions.doubleClick(plusButton).perform();
		
		int finalQuantity =Integer.parseInt(quantity.getAttribute("value"));
		
		if(finalQuantity==initialQuan+1)
			
			System.out.println("Test passed");
		else
		System.out.println("test failed");
		
		driver.quit();
			
		
	}

}
