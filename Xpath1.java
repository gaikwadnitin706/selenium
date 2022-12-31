package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shop-global.malaicha.com/login");
//		WebElement element = driver.findElement(By.xpath("//div[text()='Grocery']"));
		WebElement element = driver.findElement(By.xpath("//button[text()='Register']"));
		
		element.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
