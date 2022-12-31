package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOracle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		Thread.sleep(2000);
		boolean ele = driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).isEnabled();
		System.out.println(ele);
		driver.quit();
	}
}
