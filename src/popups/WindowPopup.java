package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.zeromq.ZStar.Set;

public class WindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		driver.findElement(By.xpath("Apple iPhone 15 (Black, 128 GB)")).click();
		
		String parentId=driver.getWindowHandle();
		Set<String> windowId=driver.getWindowHandles();
		for (String id : windowId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Apple iPhone 15 (Black, 128 GB)"));
			break;
		}
		driver.findElement(By.xpath("Add to cart")).click();
		driver.close();
		driver.switchTo().window(parentId);
		driver.navigate().refresh();
		String text=driver.findElement(By.className("_2U7eDE")).getText();
		System.out.println(text);
		driver.quit();
			
		
	}

}
