package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://ftp.igenesys.com/");
	d.findElement(By.id("username")).sendKeys("mmtdata");
	d.findElement(By.name("password")).sendKeys("XC9k1Yy(9hA2VoEq#woR");
	d.findElement(By.id("submit")).click();
	
	

	}

}
