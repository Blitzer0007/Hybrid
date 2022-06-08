package test;

import pages.Base;
import pages.LivingNav;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import helper.HelperClass;

public class LivingNavTest extends Base {
	
	
	@Test
	public void Test() throws InterruptedException, IOException
	{
		driver.get(URL);
		LivingNav lg=new LivingNav(driver);
		lg.button();
		String Name=lg.pr();
		System.out.println("product : "+lg.pr() );;
		Assert.assertEquals("Sofas",Name);
		System.out.println("actual result is eqaul to expected result");
		HelperClass.CaptureScreenshots(driver);
}
}
