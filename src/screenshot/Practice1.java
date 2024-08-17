package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/gp/video/offers/intercept?ref=dvm_us_dl_sl_go_s_brsa_mkw_sfx5Xv4Gz-dc&mrntrk=pcrid_690357294689_slid__pgrid_29008589832_pgeo_9004007_x__adext__ptid_kwd-296527732991");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/prime.png");
		FileUtils.copyFile(temp, dest);
		driver.quit();
		
		
		

	}

}
