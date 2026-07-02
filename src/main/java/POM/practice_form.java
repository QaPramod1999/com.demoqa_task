package POM;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilClass.UtilClass;

public class practice_form extends UtilClass  {
	
	WebDriver driver ;

	@FindBy( xpath ="(//div[@class=\"avatar mx-auto white\"])[2]") private WebElement Forme ;
	
	@FindBy( xpath ="(//li[@id='item-0'])[2]") private WebElement Practice ;
	
	@FindBy( xpath ="(//input[@id='firstName'])") private WebElement firstName ;

	@FindBy( xpath ="(//input[@id='lastName'])") private WebElement lastName ;
	
	@FindBy( xpath ="(//input[@id='userEmail'])") private WebElement Email ;

	
	@FindBy( xpath ="(//div[@class='form-check form-check-inline'])[1]") private WebElement Gender ;

	@FindBy( xpath ="(//input[@id='userNumber'])") private WebElement Mob ;

	@FindBy( xpath ="(//input[@id='dateOfBirthInput'])") private WebElement DOB_Box ;
	
	@FindBy( className ="react-datepicker__month-select") private WebElement month ;
	
	@FindBy( className ="react-datepicker__year-select") private WebElement year  ;

	
	@FindBy( xpath ="(//input[@class='subjects-auto-complete__input'])") private WebElement Subject ;

	
	
	@FindBy( xpath ="(//div[@class='form-check form-check-inline'])[4]") private WebElement Hobbies ;

	
	
	
	
	@FindBy( xpath ="//div[@class='css-13cymwt-control']") private WebElement StateDrop ;

	
	@FindBy( xpath ="//div[@class='css-1dimb5e-singleValue']") private WebElement State ;

	
	@FindBy( css ="css-b62m3t-container") private WebElement CityDrop ;

	@FindBy( xpath ="(//div[@class=\"css-1dimb5e-singleValue\"])[2]") private WebElement City;

	
	
	public practice_form (WebDriver driver) 
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
	
	// Wait for the image element to be visible
	
		
	public void is_Forme1() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Forme);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		expliciteWait(driver, element).click();

		 
	}
	

	public void is_Practice2() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Practice);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		expliciteWait(driver, element).click();
	}
	

	public void is_FirstName3() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,firstName);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		element.clear();

		expliciteWait(driver, element).sendKeys("Shiv");
		Thread.sleep(2000);

	}
	

	public void is_lastname4() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,lastName);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		element.clear();
		expliciteWait(driver, element).sendKeys("Shiv");
		
		Thread.sleep(2000);
		
	}
	
	
	public void is_email5() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Email);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		element.clear();

		expliciteWait(driver, element).sendKeys("Shiv@gmail.com");
		Thread.sleep(2000);

		
	}
	
	
	public void is_Gender6() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Gender);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		expliciteWait(driver, element).click();
		Thread.sleep(2000);
		
	}
	
	
	public void is_Mob7() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Mob);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		element.sendKeys("1234567890");
		Thread.sleep(2000);
		
	}
	
	public void is_DOB_BOX8( ) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,DOB_Box);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		expliciteWait(driver, element).click();
		

        // Select Month (April)
        expliciteWait(driver, month);
        Select monthDropdown = new Select(month);
        monthDropdown.selectByValue("3");   // April

        // Select Year (2015)
        expliciteWait(driver, year);
        Select yearDropdown = new Select(year);
        yearDropdown.selectByVisibleText("2015");

         // Change to any day (1-31)
        int day = 15 ;
        WebElement element1 =  driver.findElement(By.xpath(
            "//div[contains(@class,'react-datepicker__day') and " +
            "not(contains(@class,'react-datepicker__day--outside-month')) and text()='" + day + "']"));	
        element1.click();
        
	} 
	
	
	public void is_subject9() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Subject);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		 element.sendKeys("English");
		 element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		System.out.println("Subject :- " + element );

	}
	
	
	public void is_Hobbies10 () throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver ;

		WebElement element = expliciteWait(driver,Hobbies);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		 element.click();
	
	}
	
	
	
	
	public void is_State11 () throws InterruptedException
	{
		   // State
        driver.findElement(By.id("state")).click();
        driver.findElement(By.xpath("//div[text()='NCR']")).click();
		Thread.sleep(2000);
        	
	}
	
	public void is_City12 () throws InterruptedException
	{
        // City
        driver.findElement(By.id("city")).click();
        driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}
