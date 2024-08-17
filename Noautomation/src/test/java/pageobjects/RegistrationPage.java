package pageobjects;

import utility.Base;

public class RegistrationPage extends Base {
	
	
	
	public RegistrationPage fillRegistrationForm( String username, String password , String fullname, String email, String captcha ) {
		
		mylib.type(mylib.locateElement("id", "username"), username);
		mylib.type(mylib.locateElement("name","password"), password);
		mylib.type(mylib.locateElement("name","re_password"), password);
		mylib.type(mylib.locateElement("name","full_name"), fullname);
		mylib.type(mylib.locateElement("name","email_add"), email);
		mylib.type(mylib.locateElement("name","captcha"), captcha);
		mylib.clickElement(mylib.locateElement("name","tnc_box"));
		mylib.clickElement(mylib.locateElement("id", "Submit"));
		
		return this;	
	}
	


}
