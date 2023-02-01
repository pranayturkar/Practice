package Chapter3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FTPPractice2SeqExe {
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
		driver.findElement(By.xpath("//a[text()=\"Set up a new one.\"]")).click();
		driver.findElement(By.id("reset_password_email")).sendKeys("26548");
		driver.findElement(By.name("submit")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	@AfterMethod
	public void close() {
	driver.close();
}

}
