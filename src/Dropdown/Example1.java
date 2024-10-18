package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.name("Choice2"));
		Select s1 = new Select(e1);
		s1.selectByValue("practice15");
		
		

	}

}
