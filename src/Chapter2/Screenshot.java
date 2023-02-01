package Chapter2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.qspiders.com/classes/74244473-d24d-41d5-8f87-f7bf55a81a44");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //1.Typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//2. we cann acess the method nand photo will be stored in RAM
		 File src = ts.getScreenshotAs(OutputType.FILE);
		  
		 //3.Specify the location to store photo
		 File dest = new File("./qspiders.png");
		 
		 //4.Copy paste from RAM to your location
		 FileUtils.copyFile(src,dest);
		 driver.close();

	}

}
