package test;

import java.io.IOException;

import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.Delivery;

public class DeliveryTest extends Base {
	@Test
	public void test() throws InterruptedException, IOException
	{
		driver.get(URL);
		Delivery Sd=new Delivery(driver);
		Sd.SD();
		HelperClass.CaptureScreenshots(driver);
		
	}

}
