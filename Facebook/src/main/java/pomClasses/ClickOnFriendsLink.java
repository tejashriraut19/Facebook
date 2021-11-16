package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnFriendsLink {
	
	@FindBy (xpath="//a[@href='/friends/']")
	private WebElement friends;
	
	@FindBy(xpath="//span[text()='Friend requests']")
	private WebElement frndrequest;
	
	
	@FindBy(xpath="//span[text()='Suggestions']")
	private WebElement suggest;
	
	@FindBy(xpath="//span[text()='All Friends']")
	private WebElement allfrnd;
	
	@FindBy(xpath="//span[text()='Custom lists']")
	private WebElement custlist;
	
	
	public ClickOnFriendsLink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void frndsMain()
	{
		friends.click();
		
	}
	public void ClickOnAllFrndSubEle(){
		frndrequest.click();
		 
		suggest.click();
		 
		allfrnd.click();
		
		custlist.click();

		
	}

}
