package Chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE_k_&gclid=CjwKCAiA68ebBhB-EiwALVC-NoVaruIZkU236Dt-AfBdMwQDpluad8d7J5sItB84dTNTq5r0GEtRHhoCUZgQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=amazon-devices");
		Thread.sleep(3000);
		s.selectByVisibleText("Appliances");
		
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(WebElement b:opt) {
			System.out.println(b.getText());
		}

	}

}
