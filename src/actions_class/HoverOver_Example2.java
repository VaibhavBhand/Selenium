package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Example2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("(//div[@class='has_eae_slider elementor-element elementor-element-ab4cf56 e-con-full e-flex e-con e-child'])"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		
	}
}
