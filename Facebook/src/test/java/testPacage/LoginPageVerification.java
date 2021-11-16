package testPacage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.Facebook_Login;
import pomClasses.Friends_MainPage;



public class LoginPageVerification extends BaseClass {
	
	private WebDriver driver;
	private Facebook_Login loginpage;
	private Friends_MainPage frnds;
	//ChromeOptions options;
	
	
	
	@BeforeTest
	@Parameters ("browser")
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{

			
			driver=OpenChromeBrowser();
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
		
			driver=OpenFireFoxBrowser();
			
		}
//		if(browser.equalsIgnoreCase("Opera"))
//		{
//		
//			driver=OpenOperaBrowser();
//			
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/"); 
		
		
	}
	@BeforeClass
	public void createPOM()
	{
	
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications");
	       
	
		loginpage= new Facebook_Login(driver);
	
		frnds=new Friends_MainPage(driver);
      
	
		
	
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException
	{
		
		loginpage.sendUserName();
		loginpage.sendPassword();
		loginpage.login();
		Thread.sleep(3000);
		
	}

	@Test
	public void toVerifyFriendsLink() throws InterruptedException 
	{
		
	frnds.Friends();
	String url=driver.getCurrentUrl();
    System.out.println(url);
    
    Assert.assertEquals(url, "https://www.facebook.com/friends");
    System.out.println("END");
	
	
	
	Thread.sleep(3000);
	}
	
	
	
	@Test
	public void toVerifyNotificationLink() throws InterruptedException 
	{
		frnds.getNotifications();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void logOut()
	{
      loginpage.logout();
     
	}
	
	@AfterClass
	public void clearPomObjects()
	{
		loginpage=null;
		frnds=null;	
	}
	
	@AfterTest
	
	public void closedBrowser()
	{
		driver.close();
		driver=null;
		System.gc(); // all object will kill
	}
	

}
