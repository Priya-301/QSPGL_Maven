package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizefullscreen
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
	}

}
