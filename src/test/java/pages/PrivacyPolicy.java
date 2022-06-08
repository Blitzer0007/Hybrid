package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy extends Base{
	
	
	public WebDriver ldriver;
	public PrivacyPolicy(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("PrivacyPolicy");
	}
	@FindBy(xpath="//div[@class='col-md-3 links']//li//a[contains(text(),'About Us')]")
	WebElement prpolicy;
	@FindBy(xpath="//div[@class='col-md-3 links']//div[contains(text(),'The Company:')]")
	WebElement com;
	public void policy()
	{
		prpolicy.click();
		Logg.info("Clicked on PrivacyPolicy Button");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Logg.pass("successfully navigated to privacy policy page");
	}
	public String Name()
	{
		return com.getText();
	}
	
}
