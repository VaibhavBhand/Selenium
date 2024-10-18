package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_FB {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		 WebElement a1 = driver.findElement(By.id("month"));
		Select s1 = new Select(a1);
		s1.selectByValue("5");
		
		WebElement a2 = driver.findElement(By.id("day"));
		Select s2 = new Select(a2);
		s2.selectByValue("7");
		
		WebElement a3 = driver.findElement(By.id("year"));
		Select s3 = new Select(a3);
		s3.selectByVisibleText("2000");

	}

}
