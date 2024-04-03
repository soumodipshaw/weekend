package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom
{

	@FindBy (id="email")
	private WebElement email;
	
	@FindBy (id="pass")
	private WebElement pass;
	
	@FindBy (name="login")
	private WebElement login;
	
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement user()
	{
		return email;
	}
	
	public WebElement psw()
	{
		return pass;
	}
	public WebElement log() 
	{
		return login;
	}
	
}
