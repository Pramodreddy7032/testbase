package pageAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.TestBase;
import genericLibrary.Xls_Reader;
import objectRepository.Or_Fb;

public class FaceBook extends TestBase{
	@Test
 public void LaunchFb() throws Exception {
	FileInputStream fs = new FileInputStream("C:\\Users\\kishor\\Desktop1\\java.util\\NewProjectMaven\\src\\main\\java\\genericLibrary\\config.properties");
		Properties prop = new Properties();
		  prop.load(fs);
	    FaceBook fb = new FaceBook();
  Xls_Reader xl= new Xls_Reader("D:\\MY JAVA PRACTICE NOTES\\EXCEL\\excelsheets.xlsx");
	  System.out.println(prop.getProperty("browserType"));
	driver = fb.Launch_Browser(prop.getProperty("browserType"));
	  System.out.println(prop.getProperty("URL"));
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	 
 Or_Fb obj= PageFactory.initElements(driver,Or_Fb.class);
	/*obj.firstname.sendKeys(xl.getCellData("Sheet1","firstname",1));
	obj.lastname.sendKeys(xl.getCellData("Sheet1","lastname",1));
	obj.reg_email__.sendKeys(xl.getCellData("Sheet1", "mobile", 1));
	obj.birthday_day.sendKeys(xl.getCellData("Sheet1", "date",1));
	obj.birthday_month.sendKeys(xl.getCellData("Sheet1", "month",1));
	obj.birthday_year.sendKeys(xl.getCellData("Sheet1","year",1));
	*/
 // fb.waitUntil(obj.firstname);
	
	/* fb.SetText(obj.firstname,xl.getCellData("Sheet1","firstname",1));
	 fb.SetText(obj.lastname,xl.getCellData("Sheet1","lastname",1));
	 fb.SetText(obj.reg_email__,xl.getCellData("Sheet1", "mobile", 1));
	 fb.SetText(obj.birthday_day,xl.getCellData("Sheet1", "date",1));
	 fb.SetText(obj.birthday_month,xl.getCellData("Sheet1", "month",1));
	 fb.SetText(obj.birthday_year,xl.getCellData("Sheet1","year",1));
	 fb.PerformClick(obj.loginbutton);
	*/ 
	 
	 
	
	
 	/*driver.findElement(By.id("email")).sendKeys(prop.getProperty("UserName"));
	driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
	fb.captureScreenShot("before Login");
	driver.findElement(By.id("loginbutton")).click();
	fb.captureScreenShot("after Login");*/
	
	/*driver.findElement(By.name("firstname")).sendKeys(xl.getCellData("Sheet1","firstname",1));
	driver.findElement(By.name("lastname")).sendKeys(xl.getCellData("Sheet1", "lastname",1));
	driver.findElement(By.name("reg_email__")).sendKeys(xl.getCellData("Sheet1", "mobile", 1));
	Select s1= new Select(driver.findElement(By.name("birthday_day")));
	s1.selectByVisibleText(xl.getCellData("Sheet1", "date",1));
	Select s2 = new Select(driver.findElement(By.name("birthday_month")));
	s2.selectByVisibleText(xl.getCellData("Sheet1", "month",1));
	Select s3 = new Select(driver.findElement(By.name("birthday_year")));
	s3.selectByVisibleText(xl.getCellData("Sheet1","year",1));*/
	
	 /*String x = driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).getText();
	xl.setCellData("Sheet1", "pramod",1,x);
	xl.setCellData("Sheet1","result",1,"PASS");	*/
	
    fb.SelectFromDropDown(obj.birthday_day,"13","byValue");
        Thread.sleep(2000);
	fb.SelectFromDropDown(obj.birthday_month,"Jan","byText");
	    Thread.sleep(2000);      
	fb.SelectFromDropDown(obj.birthday_year,"7","byIndex");
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 