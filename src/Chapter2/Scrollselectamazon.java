package Chapter2;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollselectamazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE_k_&gclid=CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//img[@alt=\"Masks and other safety supplies\"]"));
		
		org.openqa.selenium.Point p = ele.getLocation();
		int x =p.getX();
		int y =p.getY();
		
	//typecasting
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		ele.click();

	}

}
