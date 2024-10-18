import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isslected
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vaibh/Documents/Grotechminds/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("123"));
		boolean b1 = e1.isSelected();
		
		if (b1==true)
		{
			System.out.println("the checkbox is selected");
		}
		else
		{
			System.out.println("the checkbox is not selected");
			e1.click();
		}
		
		

	}

}
