package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Or_Fb {
	@FindBy(name="firstname")
	public WebElement firstname;
	@FindBy(name="lastname")
	public WebElement lastname;
	@FindBy(name="reg_email__")
	public WebElement reg_email__;
	@FindBy(name="birthday_day")
	public WebElement birthday_day;
	@FindBy(name="birthday_month")
	public WebElement birthday_month;
	@FindBy(name="birthday_year")
	public WebElement birthday_year;
	@FindBy(id="loginbutton")
	public WebElement loginbutton;
	
	 
	
	

}
