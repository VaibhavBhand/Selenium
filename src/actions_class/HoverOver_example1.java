package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_example1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		
		WebElement E1 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(E1).perform();
		
		WebElement e2 = driver.findElement(By.className("popup4"));
		e2.click();
		
		
		
		
		WebElement e3 = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-824f369 e-con-full e-flex e-con e-child']"));
		Actions a2 =new Actions(driver);
		a2.moveToElement(e3).perform();
		
		WebElement e4 = driver.findElement(By.xpath("(//div[@class='popup6'])[5]"));
		e4.click();
		
	}

}
