package Chapter3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Assertions {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ftp.igenesys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void tcl() {
		driver.findElement(By.id("username")).sendKeys();
		driver.findElement(By.id("password")).sendKeys();
		driver.findElement(By.id("submit")).click();
		String title = driver.getTitle();
		
		//syntax pf Hard Assertions
		//Assert.assertEquals(actual,Expected);
		//example
		//Assert.assertEquals(title,"hjvsjdf");
		//example of Soft Assertions
		SoftAssert s =  new SoftAssert();
		s.assertEquals(title,"bnvgsvdf");

		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	@AfterMethod
	public void close() {
	driver.close();
}
}
