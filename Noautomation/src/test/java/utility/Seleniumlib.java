package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlib {

	private WebDriver driver;
	
	public Seleniumlib(WebDriver driver) {
		this.driver =driver;
	}
	
	public void setDriver(WebDriver _driver) {
		this.driver =_driver;
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public WebDriver startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void navigateTo(String url) {
		driver.get(url);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
	
	public String validatePageTitle() {
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	public void validateLogo(boolean logo) {
		if (logo == true) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("this is not right page");
		}
		
	}
	
	public WebElement locateElement(String locatorType, String locatorValue) {
		WebElement element;
		if (locatorType.toLowerCase().equals("id")) {
			element = driver.findElement(By.id(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("name")) {
			element = driver.findElement(By.name(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("cssselector")) {
			element = driver.findElement(By.cssSelector(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("linktext")) {
			element = driver.findElement(By.linkText(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("classname")) {
			element = driver.findElement(By.className(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("tagname")) {
			element = driver.findElement(By.tagName(locatorValue));
			return element;
		}
		else if (locatorType.toLowerCase().equals("partiallinktext")) {
			element = driver.findElement(By.partialLinkText(locatorValue));
			return element;
		}
		return null;
		
	}
	
	public void type(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickElement(WebElement element) {
		
		element.click();
	}
}
