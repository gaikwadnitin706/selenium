package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentScreenshotEle {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		LocalDateTime localTime = LocalDateTime.now();
		String time = localTime.toString().replace(":", "-");
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");  //uncomment for ele1 or ele3 
		driver.get("https://www.flipkart.com/");           //uncomment for ele2 uncomment
		
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.id("username"));		                            //uncomment for ele1
//		WebElement ele2=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));	//uncomment for ele2
//		WebElement ele3= driver.findElement(By.linkText("Forgot your password?"));              //uncomment for ele3
		
		
		File tempFile1 =ele1.getScreenshotAs(OutputType.FILE); //uncomment for ele1
//		File tempFile2 =ele2.getScreenshotAs(OutputType.FILE); //uncomment for ele2
//		File tempFile3 =ele3.getScreenshotAs(OutputType.FILE); //uncomment for ele3
		

		File destFile = new File("./errorshots/acti "+time+".png");
		FileUtils.copyFile(tempFile1, destFile); //uncomment for ele1
//		FileUtils.copyFile(tempFile2, destFile); //uncomment for ele2
//		FileUtils.copyFile(tempFile3, destFile); //uncomment for ele3

		driver.quit();
	}
}
