package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowPopPage {
WebDriver driver;

public WindowPopPage(WebDriver driver)
{
	this.driver = driver ;
    PageFactory.initElements(driver,this);
}
@FindBy(xpath ="//a[contains(text(),'Like')]") WebElement likeUsOnFacebookButton;

public void likeUsOnFacebookButtonClick()
{
	likeUsOnFacebookButton.click();

}
}



