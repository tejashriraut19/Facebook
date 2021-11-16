package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Friends_MainPage {
	
	@FindBy (xpath="//a[@href='/friends/']")
	private WebElement friends;
	
	
		
	@FindBy (xpath="//a[@aria-label='Notifications']")
	private WebElement notification;
	
	
	
	//h1[text()='Friends']
	
//    @FindBy (xpath="//input[@type='password']")
//	private WebElement password;
//    
//    @FindBy (xpath="//button[@name='login']")
//	private WebElement login;
    
    public Friends_MainPage(WebDriver driver1)
    {
    	PageFactory.initElements(driver1, this);
    }
    
    public void Friends()
    {
    	friends.click();
    }
    
//    public String getFriendText()
//    {
//    	String text=friendsText.getText();
//    	return text;
//    }
//    
	public void getNotifications()
	{
		notification.click();
	}
	
//	public void requestAccept()
//	{
//		accept.click();
//	}
//	
//    


}
