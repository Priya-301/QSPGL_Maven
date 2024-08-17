package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginBN =driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println("Before entering credential");
		if(loginBN.isEnabled())
		{
			System.out.println("Enabled");
			loginBN.click();
		}
		
		else
			System.out.println("disabled");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("sjasfjsahfjkhfkja");
		driver.findElement(By.name("password")).sendKeys("cbasjkbcajskbcjkasbc");
		System.out.println("After entering credential");
		if(loginBN.isEnabled())
		{
			System.out.println("Enabled");
			loginBN.click();
		}
		
		else
			System.out.println("disabled");
		Thread.sleep(2000);
		
		driver.quit();

	}

}
