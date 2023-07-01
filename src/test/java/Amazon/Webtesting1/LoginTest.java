package Amazon.Webtesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest
{
	
	@Test
	public void login() 
	{
		
	    System.setProperty("webdriver.chorme.driver", "\\Drivers\\chomeDriver\\chromedriver.exe");	
		WebDriver d=new ChromeDriver();
	
//		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		d.findElement(By.cssSelector("a[onclick='window.location.reload()']")).click();
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("new shirts");
		d.findElement(By.id("nav-search-submit-button")).click();
		d.close();
	}
	
}
