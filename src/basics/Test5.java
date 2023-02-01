package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("username")).sendKeys("abcde");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[6])")).click();
		String acttitle = driver.getTitle();
		if(acttitle.equals("Instagram")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	}

}
