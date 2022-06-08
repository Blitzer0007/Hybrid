package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.HelperClass;

import org.openqa.selenium.WebElement;

public class Search extends Base {
	
	
	WebDriver ldriver;
	public Search(WebDriver driver)
	{
	ldriver=driver;
	PageFactory.initElements(driver, this);
	Logg=report.createTest("search");
	}
	
	@FindBy(xpath="//input[@id='search']")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//span[@class='search-icon icofont-search']")
	WebElement button;
	
	
	public void search() throws InterruptedException, IOException
	{
		search.sendKeys("sofas");
		Logg.info("search any items");
		
		button.click();
		Thread.sleep(2000);
		HelperClass.CaptureScreenshots(driver);
		Logg.pass("Got Searched Items");
		
	}
	
}
