package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import pages.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1)
	public void testvalid() throws InterruptedException {
	
	String un=XL.getData(XL_PATH, "validLogin", 1, 0);
	String pw=XL.getData(XL_PATH, "validLogin", 1, 1);
	
	LoginPage lp=new LoginPage(driver);
	//lp.signin();
	Thread.sleep(5000);
	lp.setUname(un);
	Thread.sleep(5000);
	lp.setPassword(pw);
	Thread.sleep(2000);
	lp.setButton();
	
			
}
}


