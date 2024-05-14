package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryUiProgressPage {

	WebDriver driver;

	public JQueryUiProgressPage(WebDriver driver)
	{
		 this.driver = driver ;
	     PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(),'JQuery UI Progress')]") 
	WebElement jQueryUiProgressMenu;
	
	@FindBy(xpath="//button[contains(text(),'Start')]") 
	WebElement startDownloadButton;
	
	public void jQueryUiProgressMenuClick()
	{
		jQueryUiProgressMenu.click();
	}
	public void startDownloadButtonClick()
	{
		startDownloadButton.click();
	}
}
