package TestData;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
import POM.Elements;
import POM.practice_form;

public class Verify_Elements {
	
	WebDriver driver ;
	
	//Import Pom Classes
	Elements E1 ;
	practice_form T1 ; 
	
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException 
	 {
		 
		 driver=BaseClass.firefoxDriver();
		 driver.get("https://demoqa.com/");
		 
		 htmlReporter = BaseClass.gethtmlReporter();
		 report = BaseClass.getExtentReports();
		 test = BaseClass.getTestForReproter("Verify_Element");	
  
			
	  }
	@BeforeMethod
	public void beforeMethod() 
	  {
		  T1 = new practice_form(driver);
		  E1 = new Elements (driver);
		   
	  }
	  
	
	@DataProvider(name = "TextBoxData")
	public Object [][] EnterData(){
		return new Object[][] {
			 
	        {"Java@123", "java@gmail.com", "Navi Mumbai, Maharashtra, Pin - 400001", "Pune, Maharashtra, Pin - 400001"} ,
			 
		};
	}

	@Test(dataProvider = "TextBoxData")	
		
     public void Verify_(String UserName, String Email, String address1, String address2) throws IOException, InterruptedException {
			
			    T1.launchWebsiteValidation();
				T1.is_Forme1();
				E1.is_Element1();
				E1.is_Text_Box2();
				E1.is_userName3(UserName);
				E1.is_email4(Email);
				E1.is_Address1_5(address1);
				E1.is_Address2_6(address2);
						
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
