package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class BaseClass {

	
	public static WebDriver OpenChromeBrowser()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\automation testing\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		return driver;
		
	}
	
	public static WebDriver OpenFireFoxBrowser()
	{
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.gecko.driver","D:\\automation testing\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		return driver;
		
	}
	
//	public static WebDriver OpenOperaBrowser()
//	{
//		OperaOptions options=new OperaOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.opera.driver","D:\\automation testing\\selenium\\operadriver_win64\\operadriver.exe");
//		WebDriver driver = new OperaDriver(options);
//		return driver;
//		
//	}
	
	
	
}
