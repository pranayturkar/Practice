package Chapter3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TNGtest2 {
	@Test
	public void calls()
	{
		Reporter.log("calls",true);
	}
	@Test(priority=1, invocationCount=3, enabled=false)
	public void settings()
	{
		Reporter.log("Settings",true);
	}
	@Test(priority=-2)
	public void chats()
	{
		Reporter.log("Chats",true);
	}
	
	
}

