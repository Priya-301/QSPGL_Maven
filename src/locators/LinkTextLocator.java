package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("22487489738473478");
		driver.findElement(By.className("did_submit")).click();
		
		driver.quit();
		
		
	
	}

}
