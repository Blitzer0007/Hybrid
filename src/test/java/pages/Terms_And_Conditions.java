package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms_And_Conditions extends Base {
	
	
	public WebDriver ldriver;
	public Terms_And_Conditions (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("TermsnConditions");
	}
	
	@FindBy(xpath="//div[@class='col-md-4 links']//li//a[contains(text(),'Terms and Conditions')]") 
	WebElement TNC;

	public void TC() throws InterruptedException
	{
		TNC.click();
		Logg.info("Clicked on Terms And Conditions option");
		
		Thread.sleep(2000);
		Logg.pass("Navigated to Terms And Conditions  Page");
	}
}

