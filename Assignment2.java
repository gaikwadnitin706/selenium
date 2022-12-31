package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle ele1 = driver.findElement(By.name("pwd")).getRect();
		System.out.println("Width="+ ele1.getWidth());
		System.out.println("Height="+ ele1.getHeight());
		System.out.println("X="+ ele1.getX()); 
		System.out.println("Y="+ ele1.getY());
		
		
		driver.quit();
	}

}
