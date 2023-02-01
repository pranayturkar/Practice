package Chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/?utm_source=earth_sembrand&utm_campaign=brand_account_brandcat_cpt_1d_ftu&utm_medium=snapdeal&utm_term=437025299484_104151711009_{bidstrategy}&gclid=CjwKCAiAs8acBhA1EiwAgRFdw-Uj3LwkMwrFJyJJGC1Ea3bLd5VheRoEsK99GJ11NYCbbvw9o0g0YhoCKDYQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("7875334111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon ')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name("keyword")).sendKeys("Phone");
		driver.findElement(By.id("inputValEnter")).click();
		

	}

}
