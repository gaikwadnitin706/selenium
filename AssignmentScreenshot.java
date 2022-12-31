package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		LocalDateTime localTime = LocalDateTime.now();
		String time = localTime.toString().replace(":", "-");
		
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/");
//		driver.get("https://demo.actitime.com/login.do");
//		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./errorshotsAss/error"+time+".png");
		FileUtils.copyFile(tempFile, destFile);

		driver.quit();

	}
}
