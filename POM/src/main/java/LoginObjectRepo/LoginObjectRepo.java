package LoginObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepo {

	@FindBy(id="email")
	 public WebElement Email;
	 
	 @FindBy(id="password")
	 public WebElement Password;
	 
	 @FindBy(xpath="//button")
	 public WebElement Button;
	 	 
}
