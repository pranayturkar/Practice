package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/watch?v=PZ53jeXcoNY");
		 Thread.sleep(3000);
		 driver.manage().window().minimize();
		 Thread.sleep(3000);
		 driver.manage().window().fullscreen();
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 driver.close();
		 
		 
		 

	}

}
