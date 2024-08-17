package autosuggestion;

import java.time.Duration;
//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.*;

public class Practice1 
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("selenium");
	    List<WebElement> autosuggestions=driver.findElements(By.xpath("//li[contains(.,'selenium')]"));
	    
	    for (WebElement e : autosuggestions) 
	    {
	    	System.out.println(e.getText());
			
		}
	    driver.quit();
		
		
		}
		

	}

