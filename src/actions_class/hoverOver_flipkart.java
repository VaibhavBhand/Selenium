package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverOver_flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement fasion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions A1 = new Actions(driver);
		A1.moveToElement(fasion).perform();
		
		Thread.sleep(2000);
		
		WebElement Tshirt = driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[2]"));
		Tshirt.click();
		
		
		
	}

}
