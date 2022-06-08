package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.HelperClass;

public class aboutPage extends Base {
	
	
	public WebDriver ldriver;
	public aboutPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
		Logg=report.createTest("About page");
	}
		
		@FindBy(xpath="//ul[@class='col-md-6 no-padding bodytext']")
		@CacheLookup
		 WebElement about;
	
public void about() throws IOException
{
	System.out.println(about.getLocation());
	Logg.info("Successfully navigated to about page");
	
	Logg.pass("Successfully navigated to about page");

	HelperClass.CaptureScreenshots(ldriver);
}
}


