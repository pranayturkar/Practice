package Chapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationWeb {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to get parent browser address
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//case 1. to handle this
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://paytm.com/");
		
		//to get address of parent and child browser
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		driver.quit();
	}

}
