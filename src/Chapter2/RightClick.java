package Chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE_k_&gclid=CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele =driver.findElement(By.id("twotabsearchtextbox"));
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
		
		

	}

}
