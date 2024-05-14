package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitPage {
WebDriver driver;

public AjaxFormSubmitPage(WebDriver driver)
{
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}

@FindBy(id ="Subject") WebElement subject;
@FindBy(id ="Description") WebElement description;
@FindBy(xpath="//input[@type='submit']")WebElement ajaxSubmit;

public void subjectSendKeys()
{
	subject.sendKeys("String value");
}

public void descriptionSendKeys()
{
	description.sendKeys("String value is entered ");
}
public void ajaxSubmitButton()
{
	ajaxSubmit.click();
}

}

