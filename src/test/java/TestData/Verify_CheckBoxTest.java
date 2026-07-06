package TestData;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POM.CheckBox;
import POM.Elements;
import POM.practice_form;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Verify_CheckBoxTest {
	WebDriver driver ;
	
	CheckBox cb ;
	Elements E1 ;
	practice_form T1 ;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		 driver=BaseClass.firefoxDriver();
		 driver.get("https://demoqa.com/");
		 
		 htmlReporter = BaseClass.gethtmlReporter();
		 report = BaseClass.getExtentReports();
		 test = BaseClass.getTestForReproter("Verify_Element");	
     
		  
	  } 
	
	@BeforeMethod
	  public void beforeMethod() {
		
		cb = new CheckBox (driver );
		T1 = new practice_form(driver);
		E1 = new Elements (driver);

		
	  }
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  cb.launchWebsiteValidation();
	  T1.is_Forme1();
	  E1.is_Element1();
	  
	  cb.is_CheckBox();
	  cb.is_Home1(); 
	  cb.is_Desktop2();
	  cb.is_Documents3();
	  cb.is_Downloads4();
	  
  }
  
 
  @AfterMethod
  public void afterMethod() {
	  
  }

  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
