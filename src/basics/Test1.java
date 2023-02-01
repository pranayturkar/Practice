package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ftp.igenesys.com/");
		driver.manage().window().maximize();
		driver.get("https://online.qspiders.com/student/");
		
		Thread.sleep(3000);
		//back
		driver.navigate().back();
		Thread.sleep(3000);
		//forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();
	}

}
