package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("abcde");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[4]").click();
	
	
	}

}
