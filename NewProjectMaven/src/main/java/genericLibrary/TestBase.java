package genericLibrary;

import java.io.File;

/*import java.io.File;*/

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

  public class TestBase {
	  public static WebDriver driver;
  public WebDriver Launch_Browser(String browser) {
    	if(browser.equals("Chrome")) {
    		System.setProperty("webdriver.chrome.driver","D:\\MY JAVA PRACTICE NOTES\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
    	}
    	else if(browser.equals("Firefox")) {
    		System.setProperty("webdriver.gecko.driver","D:\\MY JAVA PRACTICE NOTES\\geckodriver-v0.21.0-win64\\geckodriver.exe");
    		driver = new FirefoxDriver();
    }
    	return driver;
}
    public  void captureScreenShot(String fileName) throws Exception{
      
    	TakesScreenshot scrShot =((TakesScreenshot)driver);
     
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
     
    	File DestFile=new File("D:\\MY JAVA PRACTICE NOTES\\screenshot\\"+ fileName +".png");
        
    	FileHandler.copy(SrcFile, DestFile);
         }
    
    public void SetText(WebElement obj,String value) {
    	obj.sendKeys(value);
    }
    public void PerformClick(WebElement obj) {
    	obj.click();
    }
    public void waitUntil(WebElement obj) {
    	WebDriverWait wait = new WebDriverWait(driver,20);
    	wait.until( ExpectedConditions.visibilityOf(obj));
    }
    public void SelectFromDropDown(WebElement obj, String value, String type) {
    	Select s = new Select(obj);
    	if(type.equals("byText")) {
    		s.selectByVisibleText(value);
    	}
    	else if(type.equals("byValue")) {
    		s.selectByValue( value);
    	}
    	else if (type.equals("byIndex")) {
    		s.selectByIndex(Integer.parseInt(value));
    	}
    }
    
   
  }
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*public static WebDriver driver;

	public WebDriver Launch_Browser(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\MY JAVA PRACTICE NOTES\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			}
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\MY JAVA PRACTICE NOTES\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();
		}
		return driver;
	}
	 public  void captureScreenShot(String fileName) throws Exception{

	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	                File DestFile=new File("D:\\MY JAVA PRACTICE NOTES\\screenshot\\"+ fileName +".png");
             FileHandler.copy(SrcFile, DestFile);
             
	}
*/
