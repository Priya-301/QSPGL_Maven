package webElementMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement headerSection=driver.findElement(By.className("row td-box td-box--gradient -bg-selenium-green p-2"));
		File temp = headerSection.getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShot/prime1.png");
		FileUtils.copyFile(temp, target);
		driver.quit();
		

	}

}
