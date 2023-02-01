package Chapter2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE_k_&gclid=CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-5000)");

	}

}
