package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.UtilClass;

public class Radio_Button extends UtilClass {
	
	WebDriver driver ;
	
	
	@FindBy(linkText = "Radio Button" ) private WebElement Radio_Button ;
	
	@FindBy(xpath = "(//input[@id='yesRadio'])" ) private WebElement Yes ;

	@FindBy(xpath = "(//input[@id='impressiveRadio'])" ) private WebElement Impressive ;

	
	public  Radio_Button (WebDriver driver) 
	{
		PageFactory.initElements(driver , this);
		this.driver = driver;
	}

	
	public void is_website() {
		
		driver.get("https://demoqa.com/");
		
	}
	
	public void is_Radio_Button() {
		
		expliciteWait(driver, Radio_Button);
		Radio_Button.click();
		
	}
	
	
	public void is_yes() {
		
		expliciteWait(driver, Yes).click();
		
		System.out.println("Optio Yes :-" + Yes.getAccessibleName() );
		
	}
	
	public void is_Impressive() {
		
		expliciteWait(driver, Impressive).click();
		
		System.out.println("Optio Impressive :-" + Impressive.getAccessibleName() );
		
	}
	
	

}
