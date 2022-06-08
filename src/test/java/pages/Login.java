package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends Base{


	WebDriver ldriver;
	public Login(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("Login page");

	}	

	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	@CacheLookup
	WebElement sign;

	@FindBy(xpath="//a[contains(text(),'Log In')]")
	@CacheLookup
	WebElement sign2;

	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath="//div[@class='password']//input[@class='required input_authentication']")
	@CacheLookup
	WebElement pass;
	@FindBy(xpath="//input[@id='ul_site_login']")
	@CacheLookup
	WebElement login;


	@FindBy(xpath="//div[contains(text(),'The email or password you entered is incorrect. Pl')]")
	WebElement com;

	public void sign2(String Email,String password) throws InterruptedException
	{
		sign.click();
		//Thread.sleep(2000);
		sign2.click();
		Thread.sleep(5000);
		email.sendKeys(Email);
		Logg.info("Enterd Email ID");
		Thread.sleep(2000);
		pass.sendKeys(password);
		Logg.info("Enterd PassWord");
		login.click();
		Logg.info("Successfully Login");
		
	}


	public String com()
	{
		return com.getText();
		
	}

	
}

