package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import pages.LoginpageInvalid;

public class InvalidLogin extends BaseTest {
@Test(priority=2)
public void TestInvalid() throws InterruptedException {
	String un=XL.getData(XL_PATH, "invalidLogin", 1, 0);
	String pw=XL.getData(XL_PATH, "invalidLogin", 1, 1);
	LoginpageInvalid InLg= new LoginpageInvalid(driver);
	InLg.setUname(un);
	Thread.sleep(2000);
	InLg.setPassword(pw);
	Thread.sleep(3000);
	InLg.setButton();
	
}
}
