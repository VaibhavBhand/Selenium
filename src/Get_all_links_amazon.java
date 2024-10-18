import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_all_links_amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		List<WebElement> a=	driver.findElements(By.tagName("a"));
		int c = a.size();
		System.out.println(c);
		
		for(int i=0;i<c;i++)
		{
			WebElement x = a.get(i);
			String link = x.getAttribute("href");
			System.out.println(link);
		}
		
	}

}
