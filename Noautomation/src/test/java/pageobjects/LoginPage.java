package pageobjects;

import org.openqa.selenium.WebDriver;

import utility.Base;

public class LoginPage  extends Base{
	/* comment added */
	public LoginPage  userLogin(String username, String password) {
		mylib.type(mylib.locateElement("id", "username"), username);
		mylib.type(mylib.locateElement("name","password"), password);
		mylib.clickElement(mylib.locateElement("className","login_button"));		
		return this;
	}
	
	public LoginPage  gotoRegistrationPage() {
		mylib.locateElement("partiallinktext", "New User Register Here").click();
		System.out.println(mylib.validatePageTitle());
		return this;
	}

}
