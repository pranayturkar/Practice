package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("////input[contains(@class,\"_2IX_2- _3umUoc VJZDxU\")]")).sendKeys("758458455");
	driver.findElement(By.xpath("(//input[contains(@class,\"_2IX_2- _3mctLh VJZDxU\")]")).sendKeys("65866");
	driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();

	}

}
