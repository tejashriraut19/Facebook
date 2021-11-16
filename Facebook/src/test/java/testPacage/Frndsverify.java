package testPacage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.ClickOnFriendsLink;
import pomClasses.Facebook_Login;


public class Frndsverify extends BaseClass{
	
	private WebDriver driver;
	private Facebook_Login loginpage;
	private ClickOnFriendsLink clk;
	
//	@BeforeTest
//	@Parameters ("browser")
//	public void launchBrowser(String browser)
//	{
//		if(browser.equalsIgnoreCase("firefox"))
//		{
//
//			
//			driver=OpenChromeBrowser();
//		}
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//		
//			driver=OpenFireFoxBrowser();
//			
//		}
////		if(browser.equalsIgnoreCase("Opera"))
////		{
////		
////			driver=OpenOperaBrowser();
////			
////		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://en-gb.facebook.com/"); 
//	}
	@BeforeClass
	public void BeforeClass()
	{
		loginpage= new Facebook_Login(driver);
		
		clk=new ClickOnFriendsLink(driver);
		
        
	}
	@BeforeMethod
	public void clickonLogin() throws InterruptedException
	{
		
		loginpage.sendUserName();
		loginpage.sendPassword();
		loginpage.login();
		Thread.sleep(3000);
		clk.frndsMain();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
	}
	
	@Test
	public void VerifyFrndEle() throws InterruptedException
	{
		
		clk.ClickOnAllFrndSubEle();
	
	    Thread.sleep(3000);
	    String url=driver.getCurrentUrl();
		System.out.println(url);

	}
	
	
	@AfterMethod
	public void logoutFb()
	{
      loginpage.logout();
      
	}
	
	@AfterClass
	public void NullPomObj()
	{
		loginpage=null;
		clk=null;	
		
	}

}
