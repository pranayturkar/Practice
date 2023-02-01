package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FTP {
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="submit")
	private WebElement loginbtn;
	
	public FTP(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void usernametextbox(String name) {
		usernametb.sendKeys(name);
	}
	
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
}
