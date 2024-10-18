package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_over_amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement accl = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(accl).perform();
		
		
	WebElement signin =	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	signin.click();
	}

}
