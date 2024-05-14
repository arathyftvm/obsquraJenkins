package util;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass {
WebDriver driver;

public ExtentReports generateReports(){
    String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
    htmlReporter.config().setDocumentTitle("Automation Report");
    htmlReporter.config().setReportName("Test Automation Results");
    htmlReporter.config().setTheme(Theme.STANDARD);
    ExtentReports extentReports= new ExtentReports();
    extentReports.attachReporter(htmlReporter);
    return extentReports;
}
}

/*public  void myTestMethod5(String p){
extentReports = generateReports() ;
ExtentTest extenTest =extentReports .createTest("myTestMethod5");
extenTest.log(Status.INFO,"entering test");
System.out.println(p);
extenTest.log(Status.PASS,"test passed");
extentReports.flush();
}


extenTest.log(Status.PASS,"test passed");*/