package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverIntializer {
	
	WebDriver driver;
	public static final String URL="https://selenium.qabible.in/index.php";
	@BeforeClass
	@Parameters({"browser"})
	public String browerLaunch(@Optional String browser)
	
	{
	System.out.println(browser);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/main/resources/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/main/resources/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		if(browser.equalsIgnoreCase("Edge"))
		{
			
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/main/resources/msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		else
		{
			WebDriver driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/main/resources/chromedriver.exe");
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		return browser;
		
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	

}

