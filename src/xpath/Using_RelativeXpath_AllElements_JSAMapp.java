package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_RelativeXpath_AllElements_JSAMapp 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vaibh/Documents/Grotechminds/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement UN = driver.findElement(By.xpath("(//input)[1]"));
		UN.sendKeys("v.bhand");
		
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("hint");
		
		WebElement password = driver.findElement(By.xpath("(//input)[3]"));
		password.sendKeys("abcd");
		
		WebElement fn = driver.findElement(By.xpath("(//input)[4]"));
		fn.sendKeys("vaibhav");
		
		WebElement checkbox = driver.findElement(By.xpath("(//input)[7]"));
		checkbox.click();
		

	}

}

