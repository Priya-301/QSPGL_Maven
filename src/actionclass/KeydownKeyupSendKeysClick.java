package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeydownKeyupSendKeysClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userName=driver.findElement(By.id("email"));
		
		WebElement loginBTn=driver.findElement(By.name("login"));
		Actions actions=new Actions(driver);
        
		actions.keyDown(Keys.SHIFT).sendKeys(userName,"sdfhjdfhjkhfj").keyUp(Keys.SHIFT).sendKeys(Keys.TAB,"shfkjsahfkajshf").click(loginBTn)
		   .build().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
