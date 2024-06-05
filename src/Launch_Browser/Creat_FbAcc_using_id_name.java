package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creat_FbAcc_using_id_name 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_0_El")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("abcd");
		driver.findElement(By.id("password_step_input")).sendKeys("pqrs");
		driver.findElement(By.name("firstname")).sendKeys("vaibhav");
		driver.findElement(By.name("lastname")).sendKeys("Bhand");
		driver.findElement(By.id("u_6_5_K1")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}
