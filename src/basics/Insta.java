package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
	
		
		a.get("https://ftp.igenesys.com/");
		a.findElement(By.id("username")).sendKeys("mmtdata");
		a.findElement(By.name("password")).sendKeys("XC9k1Yy(9hA2VoEq#woR");
		a.findElements(By.id("submit")).click();
		

	}

}
