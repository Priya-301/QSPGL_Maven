package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSubmitPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement SearchTF=driver.findElement(By.id("twotabsearchtextbox"));
		SearchTF.sendKeys("Shoes");
		Thread.sleep(2000);
		SearchTF.clear();
		SearchTF.sendKeys("Softtoys");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(3000);
		driver.quit();


}
}
