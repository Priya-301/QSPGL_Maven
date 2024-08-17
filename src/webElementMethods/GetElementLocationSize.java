package webElementMethods;

//import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementLocationSize {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createAccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
		Point location = createAccount.getLocation();
		
		System.out.println("x Coordinate"+location.getX()+"Y :Cordinate"+location.getY());
		
		Dimension dimension = createAccount.getSize();
		System.out.println("height"+dimension.getHeight()+"width"+dimension.getWidth());
		
		
		
		org.openqa.selenium.Rectangle rect=createAccount.getRect();
		System.out.println("x Coordinate"+rect.getX()+"Y :Cordinate"+rect.getY());
		System.out.println("height"+rect.getHeight()+"width"+rect.getWidth());
		driver.quit();
	}

}
