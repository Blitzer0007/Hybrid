package pages;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import helper.HelperClass;
import utilities.Read;

public class Base {
	
	public static ExtentTest rprt;
	public static ExtentReports report;
	public static String fileName=null;
	public static WebDriver driver;
	Read rd=new Read();
	public Logger log;
	public String URL=rd.URl();
	public String Email=rd.Email();
	public String PassWord=rd.password();
	public ExtentTest Logg;
	
	
	
	@BeforeClass
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//log report
		log=Logger.getLogger("Base");
		PropertyConfigurator.configure("log4j.properties");
		
		//Extent report
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports//UR"+HelperClass.getcurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		
		
		
		
		
	}
	
	
	@AfterClass
	public void tear()
	{
		driver.close();
		report.flush();
	}


}
