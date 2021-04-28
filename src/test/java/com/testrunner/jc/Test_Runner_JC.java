package com.testrunner.jc;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.create.base.Base_Class;
import com.helper.jc.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//featurefile//jc", glue = "com.stepdefinition.jc" ,
monochrome=true,
	dryRun=false,
	strict=true,
	tags=("@Smoketest,@Sanitytest"),
	plugin = {"html:Report/HTML_Report",
				"pretty",
				"json:Reports/jsonReport.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
	)

public class Test_Runner_JC {
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_Up() throws Throwable {
			
		String browser = FileReadManager.getInstanceFile().getInstanceCR().getBrowser();
		driver=Base_Class.getbrowser(browser);
		Base_Class.imwait();
	
	}
	
	
	
	
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
