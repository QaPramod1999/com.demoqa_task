package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilClass.UtilClass;

public class CheckBox extends UtilClass  {
	
	WebDriver driver ;

	@FindBy( xpath ="(//li[@class='btn btn-light '])[2]") private WebElement CheckBox1 ;
	
	@FindBy( xpath ="//span[@class='rc-tree-switcher rc-tree-switcher_close']") private WebElement open ;
	@FindBy( xpath ="//span[@class='rc-tree-switcher rc-tree-switcher_open']") private WebElement Close  ;
	
	//Home
	@FindBy( linkText ="Home") private WebElement Home ;
	
	
	//Desktop
	@FindBy( linkText ="Desktop") private WebElement Desktop ;
	@FindBy( linkText ="Notes") private WebElement Notes ;
	@FindBy( linkText ="Commands") private WebElement Commands ;

	//Documents
	@FindBy( linkText ="Documents") private WebElement Documents ;
	@FindBy( linkText ="WorkSpace") private WebElement WorkSpace ;
	@FindBy( linkText ="Office") private WebElement Office ;
	
	//Downloads
	@FindBy( linkText ="Home") private WebElement Downloads ;
	@FindBy( linkText ="Word File.doc") private WebElement Word_File_doc ;
	@FindBy( linkText ="Excel File.doc") private WebElement Excel_File_doc ;

	
	
	
	
	public CheckBox (WebDriver driver) 
		{
			PageFactory.initElements(driver , this);
			this.driver = driver;
		}
		
	
	public void launchWebsiteValidation() {
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://demoqa.com/";

	    System.out.println("Expected URL : " + expectedUrl);
	    System.out.println("Actual URL   : " + actualUrl);

	    Assert.assertEquals(actualUrl, expectedUrl, "URL does not match!");
	    
	    System.out.println("Website launched successfully and URL verified.");
	}
	
		
	public void is_CheckBox () throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		// Wait for the image element to be visible
		WebElement element = expliciteWait(driver,CheckBox1);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		expliciteWait(driver, element).click();
 
	}
	
	public void is_Home1() throws InterruptedException
	{
		expliciteWait(driver, open);
		open.click();
			
	    
	}
	

	public void is_Desktop2() throws InterruptedException
	{
		expliciteWait(driver,open).click();
		expliciteWait(driver,Notes).click();
		expliciteWait(driver,Commands).click();
		
		
	}
	

	public void is_Documents3() throws InterruptedException
	{
		
		expliciteWait(driver,open).click();
		expliciteWait(driver,WorkSpace).click();
		expliciteWait(driver,Office).click();
		
		
	}
	
	public void is_Downloads4() {
		
		expliciteWait(driver,open).click();
		expliciteWait(driver,Word_File_doc).click();
		
		expliciteWait(driver,Excel_File_doc).click();
		
	}
	
	
}
