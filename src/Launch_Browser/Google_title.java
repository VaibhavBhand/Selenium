package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_title 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
