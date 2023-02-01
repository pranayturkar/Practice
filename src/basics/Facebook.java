package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.id("email")).sendKeys("7875334143");
	driver.findElement(By.id("pass")).sendKeys("abc13");
	driver.findElement(By.id("loginbutton")).click();
	String title = driver.getTitle();{
		System.out.println(title);
		}
	
	String url = driver.getCurrentUrl();
	{System.out.println(url);}
	if(title.equals("Facebook"))
	{System.out.println("Pass");}
	else
	{System.out.println("Fail");}
	driver.close();

	}

}
