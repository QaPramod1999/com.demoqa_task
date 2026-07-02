package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilClass.UtilClass;

public class Elements extends UtilClass  {
	
	WebDriver driver ;

	@FindBy( xpath ="(//div[@class='header-text'])[1]") private WebElement Elements ;
	
	@FindBy( linkText ="Text Box") private WebElement Text_Box ;
	
	@FindBy( xpath ="(//input[@id='userName'])") private WebElement FullName ;

	@FindBy( xpath ="(//input[@type='email'])") private WebElement  email;
	
	@FindBy( xpath ="(//textarea[@id='currentAddress'])") private WebElement  Address1;

	@FindBy( xpath ="(//textarea[@id='permanentAddress'])") private WebElement  Address2;

	
	
	public Elements (WebDriver driver) 
		{
			PageFactory.initElements(driver , this);
			this.driver = driver;
		}
		
	// Wait for the image element to be visible
	JavascriptExecutor js = (JavascriptExecutor)driver ;
	
	
		
	public void is_Element1() throws InterruptedException
	{
		boolean ele = expliciteWait(driver, Elements).isDisplayed();
		System.out.println("element on Page :- " + ele);
		Elements.click();	 
	}

	public void is_Text_Box2() throws InterruptedException
	{
		boolean ele = expliciteWait(driver, Text_Box).isDisplayed();
		System.out.println("Text Box on a Page :- " + ele);
		Text_Box.click();    
		
		
	}
	

	public void is_userName3(String UserName) throws InterruptedException
	{
		expliciteWait(driver, FullName);
		FullName.sendKeys(UserName);
		Thread.sleep(1000);
	}
	

	public void is_email4(String Email) throws InterruptedException
	{
		expliciteWait(driver, email);
		email.sendKeys(Email);
		Thread.sleep(1000);
	}
	
	public void is_Address1_5(String address) {
		
		expliciteWait(driver, Address1);
		Address1.sendKeys(address);
	}
	
public void is_Address2_6(String address) {
		
		expliciteWait(driver, Address2);
		Address2.sendKeys(address);
	}
	
	
}
