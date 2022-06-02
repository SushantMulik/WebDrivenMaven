package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	

public class Login {
	
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();	
	}
	@Test
	public void dologin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("sushant@cateina.com");
		driver.findElement(By.id("Passwd")).sendKeys("Search@123");
		driver.findElement(By.id("SignIn")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
