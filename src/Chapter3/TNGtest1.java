package Chapter3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TNGtest1 {
	@Test
	public void demo()
	{
		Reporter.log("Hello java",true);
		Reporter.log("Hello Selenium",false);
		
	}
	

}
