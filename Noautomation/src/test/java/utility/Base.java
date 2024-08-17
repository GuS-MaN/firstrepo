package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	 	public static WebDriver driver;
	 	public static Seleniumlib mylib = new Seleniumlib(driver);
	 	
		@BeforeMethod
		public void setUp() {
			driver =mylib.startBrowser();
			mylib.navigateTo("https://adactin.com/HotelApp/index.php");
			mylib.validateLogo(mylib.locateElement("xpath", "/html/body/table[1]/tbody/tr[1]/td[1]/img").isDisplayed());
		}
		
		@AfterMethod
		public void tearDown() {
			mylib.getDriver().close();
			mylib.getDriver().quit();
//			driver.close();
//			driver.quit();
		}
}
