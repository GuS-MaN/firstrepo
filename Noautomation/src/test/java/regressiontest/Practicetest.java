package regressiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.RegistrationPage;
import utility.Base;

public class Practicetest extends Base{
	
	public WebDriver driver;
	LoginPage mylogin = new LoginPage();
	RegistrationPage register =  new RegistrationPage();
	
	@Test (enabled = false)
	public void test1() throws InterruptedException {
		mylib.clickElement(mylib.locateElement("xpath","//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a"));
		Thread.sleep(3000);
		mylib.navigateBack();
	}
	
	@Test(enabled = false)
	public void test2() throws InterruptedException {
		mylogin.userLogin("abc1234", "1234abc");
		WebElement errorMsg = mylib.locateElement("cssSelector",".auth_error");
		System.out.println(errorMsg.getText());
		Thread.sleep(3000);
	}
	
	@Test(enabled = true)
	public void test3() throws InterruptedException {
		mylogin.gotoRegistrationPage();
		register.fillRegistrationForm("abc", "abc123", "abcbcd", "abc@gmail.com", "abc123");
		Thread.sleep(3000);
		String erroMsg = mylib.locateElement("id","captcha_span").getText();
		Assert.assertEquals(erroMsg, "Captcha is Invalid");
	}
	
	
	@Test(enabled = false)
	public void test4() throws InterruptedException {
		mylogin.gotoRegistrationPage();
		register.fillRegistrationForm("abc", " ", " ", "abc@gmail.com", " ");
		Thread.sleep(3000);
	}
//	
//	@Test(enabled = false)
//	public void test3() throws InterruptedException {
//		clickElement(locateElement("xpath","//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a"));
//		driver.navigate().back();
//		Thread.sleep(3000);
//		clickElement(locateElement("partialLinkText","Forgot"));
//		Thread.sleep(3000);
//		String resetpage = driver.getTitle();
//		System.out.println(resetpage);
//		
//	}
//	
//	@Test(enabled = false)
//	public void test4() throws InterruptedException {
//		type(locateElement("id", "username"), "abc1234");
//		type(locateElement("name","password"), "1234abc");
//		clickElement(locateElement("className","login_button"));
//		clickElement(locateElement("cssSelector",".auth_error"));
//		Thread.sleep(3000);
//		String currentUrl = driver.getCurrentUrl();
//		if(currentUrl.equals("https://adactin.com/HotelApp/index.php") ){
//			System.out.println("u r on the same page");
//		}
//		else {
//			System.out.println("u r not on the same page");
//		}
//		
//	}
}
