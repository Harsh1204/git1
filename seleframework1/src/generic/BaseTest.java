package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void openApplication() {
		
		driver=new FirefoxDriver();
		driver.get(Lib.getPropertyValue("URL"));
	}
	@AfterMethod
	public void closeApplication() {
		driver.close();
	}

}
