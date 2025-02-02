package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement googleImg=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		 Actions actions=new Actions(driver);
		 actions.contextClick(googleImg).perform();
		 
		 Thread.sleep(2000);
		 driver.quit();
		

	}

}
