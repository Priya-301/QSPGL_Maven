package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String result = driver.findElement(By.xpath("//p")).getText();
		System.out.println(result);
        driver.quit();
	}

}