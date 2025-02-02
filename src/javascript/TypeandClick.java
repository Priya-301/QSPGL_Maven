package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeandClick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTF=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searcBTN=driver.findElement(By.id("nav-search-submit-button"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",searchTF ,"wallets");
		js.executeScript("arguments[0].click",searcBTN );
		Thread.sleep(2000);
		 driver.quit();

	}

}
