package test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import helper.HelperClass;
import pages.Base;
import pages.PrivacyPolicy;
import pages.aboutPage;

public class aboutTest extends Base {

	@Test
	public void met() throws InterruptedException, IOException
	{
		driver.get(URL);
		Thread.sleep(2000);
		aboutPage ab=new aboutPage(driver);

		ab.about();
		log.info("page about");
		Thread.sleep(3000);
	
		HelperClass.CaptureScreenshots(driver);
		//driver.navigate().back();
		//Thread.sleep(2000);
	}
	
		

	}
