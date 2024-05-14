package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.HomePage;
import pages.InputForm;
import pages.SimpleFormDemoPage;

public class TestRunnerClass extends DriverIntializer{
	WebDriver driver;
	HomePage homepage;
	InputForm inputform;
	SimpleFormDemoPage simpledemo;
	String achualMsg="Your Message : PageObject Factory";
	@Test
	 @Parameters({"browser"})
		public void simpleFormVerify()
		{ 
		    driver= getDriver();
			homepage =new HomePage(driver);
			homepage.inputFormClick();
			inputform =new InputForm(driver);
			inputform.simpleFormDemoMenuClick();
			simpledemo =new SimpleFormDemoPage(driver);
			simpledemo.simpleInputFieldType("PageObject Factory");
			simpledemo.clickShowMsg();
			String expectedMessage=simpledemo.messageCheck();
			Assert.assertEquals(achualMsg,expectedMessage);
		}
	}
	

