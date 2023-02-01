package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ftp.igenesys.com/");
	driver.findElement(By.id("username")).sendKeys("mmtdata");
	driver.findElement(By.name("password")).sendKeys("XC9k1Yy(9hA2VoEq#woR");
	driver.findElement(By.id("submit")).click();
	

	}

}
