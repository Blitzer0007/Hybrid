package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingNav extends Base {
	
	
	public WebDriver ldriver;
	public LivingNav (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("Living Page");
	}
	
	@FindBy(xpath="//div//li[@class='topnav_item livingunit']") 
	WebElement button;
	
	@FindBy(xpath="//li[@class='subnav_item 8078'] ")
	WebElement  Sofas;
	@FindBy(xpath="//h1[contains(text(),'Sofas')]")
	WebElement pr;
	
	
	public void button() throws InterruptedException
	{
		button.click();
		Logg.info("Clicked on Living Option");
		Thread.sleep(2000);
		Sofas.click();
		Logg.pass("Navigated to Living Page" );
	}
	public String pr()
	{
	return pr.getText();
	}
	
}
