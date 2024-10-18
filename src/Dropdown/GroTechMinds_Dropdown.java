package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMinds_Dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement a1 =driver.findElement(By.id("Choice1"));
		
		Select s1 = new Select(a1);
		s1.selectByVisibleText("Demo2");
		
		

	}

}
