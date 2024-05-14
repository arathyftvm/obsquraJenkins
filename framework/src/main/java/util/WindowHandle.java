package util;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {
	 WebDriver driver;
	public void WindowHandleMethod()
	{
   String parentWindow = driver.getWindowHandle(); //current window handle
   Set<String> WindowHandlesss= driver.getWindowHandles(); //all windows handle
   for (String childWindow : WindowHandlesss) 
   	{
	   if (!parentWindow.equals(childWindow)) 
	   		{
		   	driver.switchTo().window(childWindow);
	   		}
   	}	
	}
}


