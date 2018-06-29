package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;


public class TestLogin extends BaseTest{
	String username;
	String password;
	
	@Test
	public void testlogin() throws InterruptedException {
		username=Lib.getCellValue("Sheet1", 1, 0);
		password=Lib.getCellValue("Sheet1", 1, 1);
	LoginPage p=new LoginPage(driver);
	Thread.sleep(5000);
	p.setUsername(username);
	p.setPassword(password);
	Thread.sleep(5000);
	p.clk();
	Thread.sleep(5000);
	
	}
}
