package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class FileUpload {
WebDriver driver;

public void robotUpload() throws AWTException

{
	String filePath = "path/to/your/file.txt";
    Robot robot = new Robot();
    StringSelection stringSelection = new StringSelection(filePath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
   // driver.findElement(By.xpath("")).click();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
}
