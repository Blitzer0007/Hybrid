package test;

import java.io.IOException;

import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.Search;

public class SearchTest extends Base {

	@Test
	public void test2() throws InterruptedException, IOException
	{

		driver.get(URL);
		Search sr=new Search(driver);
		sr.search();
		log.info("Search successfull");
		HelperClass.CaptureScreenshots(driver);
		




	}


}

