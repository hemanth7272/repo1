package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	@FindBy(xpath="//a[text()='Login & Signup']")
//	private WebElement SINBTN;
	@FindBy(xpath = "(//input[@type='text'])[2]")

	private WebElement UNTB;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PWTB;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement LGBTN;

	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*public void signin() {
		SINBTN.click();
	}*/
	public void setUname(String un) {
		UNTB.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		PWTB.sendKeys(pw);
	}

	public void setButton() {
		LGBTN.click();
	}
}
