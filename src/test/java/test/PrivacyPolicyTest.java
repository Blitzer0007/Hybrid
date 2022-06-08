package test;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.PrivacyPolicy;


public class PrivacyPolicyTest extends Base {

	
	
	@Test
	public void test1() throws InterruptedException, IOException {
		driver.get(URL);
		Thread.sleep(2000);
		PrivacyPolicy pp=new PrivacyPolicy(driver);
		String name=pp.Name();
	
		
		Assert.assertEquals("The Company:", name);
		pp.policy();
		log.info("Navigated to privacy policy page");
		Thread.sleep(2000);
	HelperClass.CaptureScreenshots(driver);
	}

}
