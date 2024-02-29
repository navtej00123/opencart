package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage
{
	public Loginpage (WebDriver driver)
	{
		super(driver);
	}
	//Elements
	
    @FindBy(xpath="//input[@id='input-email']")WebElement txtid;
	@FindBy(xpath="//input[@id='input-password']")WebElement txtpswd;
	@FindBy(xpath="//input[@value='Login']")WebElement btnlogin;
	
	
	public void setemail(String email)
	{
		txtid.sendKeys(email);
	}
	public void setpassword(String psw)
	{
		txtpswd.sendKeys(psw);
	}
	public void clicklogin()
	{
		btnlogin.click();
	}
}
