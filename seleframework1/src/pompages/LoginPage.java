package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	WebElement unTb;
	@FindBy(name="pwd")
	WebElement pdTb;
	@FindBy(id="loginButton")
<<<<<<< HEAD
	WebElement btn;
=======
	WebElement btn;//init
>>>>>>> branch 'master' of https://github.com/Harsh1204/git1.git

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//f
		
	}
	public void setUsername(String un) {
		unTb.sendKeys(un);
	}
	public void setPassword(String pwd) {
		pdTb.sendKeys(pwd);
	}
	public void clk() {
		btn.click();
	}
	

}
