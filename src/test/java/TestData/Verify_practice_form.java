package TestData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POM.practice_form;
import UtilClass.UtilClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_practice_form{
	
	WebDriver driver ; 
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;

	practice_form T1 ;
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException 
	 {
		 
		 driver=BaseClass.firefoxDriver();
		 driver.get("https://demoqa.com/");
    
		 htmlReporter = BaseClass.gethtmlReporter();
		 report = BaseClass.getExtentReports();
		 test = BaseClass.getTestForReproter("Verify_practice_form");	
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  T1 = new practice_form(driver);
		   
	  }
	  
		
		@Test
       public void Verify_practice_form ( ) throws IOException, InterruptedException {
		
		   T1.launchWebsiteValidation();
		   T1.is_Forme1();
		   T1.is_Practice2();
		   T1.is_FirstName3();
		   T1.is_lastname4();
		   T1.is_email5();
		   T1.is_Gender6();
		   T1.is_Mob7();
		   T1.is_DOB_BOX8();
		   T1.is_subject9();
		   T1.is_Hobbies10();
		   T1.is_State11();
		   T1.is_City12();
		   	   
	  }
	 	
	   
	  @AfterMethod
	  public void afterMethod(ITestResult result) throws IOException {

		  if(result.getStatus() == ITestResult.SUCCESS){
				test.log(Status.PASS, "Test is passed " + result.getName());
			}
			else {
				String path = T1.getScreenShot(driver, result.getName());
				test.log(Status.FAIL, "Test is failed " + result.getName(), 
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}  	
		    
	  } 
 	  
     @AfterClass
     public void afterClass() {
    
    	 driver.quit();
    	 
  }
}
