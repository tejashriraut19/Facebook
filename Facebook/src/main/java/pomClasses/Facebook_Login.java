package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login {

    @FindBy (xpath="//input[@id='email']")
	private WebElement username;
    
    @FindBy (xpath="//input[@type='password']")
	private WebElement password;
    
    @FindBy (xpath="//button[@name='login']")
	private WebElement login;
    
    @FindBy (xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	//span[contains(text(),'Log Out')]
	
	@FindBy (xpath="//span[contains(text(),'Log Out')]")
	private WebElement log;
	
    public Facebook_Login(WebDriver driver1)
    {
    	PageFactory.initElements(driver1, this);
    }
    
    public void sendUserName()
    {
    	username.sendKeys("tejashriraut99@gmail.com");
    }
    
    public void sendPassword()
    {
    	password.sendKeys("t414414r");
    }
    
    public void login()
    {
    	login.click();
    	
    }
//    public void accountFb()
//	{
//		account.click();
//	}
	
	
	public void logout()
	{
		account.click();
		log.click();
	}
    

    

}
