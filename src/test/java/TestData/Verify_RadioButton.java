package TestData;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POM.Elements;
import POM.Radio_Button;
import POM.practice_form;

public class Verify_RadioButton {
	
	WebDriver driver ;
	Elements E1 ;
	practice_form T1 ;
	Radio_Button rb ;
	
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		 driver=BaseClass.firefoxDriver();
		// driver.get("https://demoqa.com/");
		 
		 htmlReporter = BaseClass.gethtmlReporter();
		 report = BaseClass.getExtentReports();
		 test = BaseClass.getTestForReproter("Verify_Element");	
     
		  
	  }
	
	@BeforeMethod
	  public void beforeMethod() {

		T1 = new practice_form(driver);
		E1 = new Elements (driver);
		rb = new Radio_Button(driver);

		
	  }
	
	
  @Test
  public void f() throws InterruptedException {
	  
		 rb.is_website();
		 T1.is_Forme1();
		 E1.is_Element1();
		  
		 rb.is_Radio_Button();
		 
		  for(int i = 0 ; i<= 5 ;i++ ) 
		  {
		  rb.is_yes();
		  rb.is_Impressive();
		  }
  }
   
  
  @AfterMethod
  public void afterMethod() {
	  
  }

  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
