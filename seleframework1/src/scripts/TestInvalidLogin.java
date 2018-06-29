package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest {
	String username;
	String password;
       @Test
       public void testInvalidLogin() throws InterruptedException {
    	   
    	   LoginPage lp= new LoginPage(driver);
    	   int rowCount=Lib.getRowCount("Sheet1");
    	   for(int i=2;i<= rowCount;i++) {
    		   username=Lib.getCellValue("Sheet1", i, 0);
    	   		password=Lib.getCellValue("Sheet1", i, 1);
    		   lp.setUsername(username);
    			lp.setPassword(password);
    			Thread.sleep(5000);
    			lp.clk();
    	   }
       }

}
