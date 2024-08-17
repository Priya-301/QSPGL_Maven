package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeText {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBT=driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(loginBT.getText());
		System.out.println(loginBT.getTagName());
		
		System.out.println(loginBT.getCssValue("background-color"));
	    System.out.println(	loginBT.getCssValue("font"));
		System.out.println(loginBT.getCssValue("color"));
		
		driver.quit();
		

	}

}
