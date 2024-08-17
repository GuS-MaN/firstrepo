package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Seleniumpractice {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test (enabled = false)
	public void test1() throws InterruptedException {
		System.out.println("Welcome!!");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("hello");
		driver.findElement(By.name("lastname")).sendKeys("bye");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("bye@bye.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bye@bye.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc1234");
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
	}
    
	//Go to facebook.com, check the facebook logo is available or not
	
	@Test(enabled = false)
	public void test2() throws InterruptedException {
		boolean logo = driver.findElement(By.cssSelector("#content > div > div > div > div._8esl > div > img")).isDisplayed();
		System.out.println(logo);
		if(logo ==true) {
			System.out.println("logo is available");
		}
		else {
			System.out.println("logo is not available");
		}
	}
	
	// give wrong user name & password and click login. Check the error msg(invalid login details) shown or not
	@Test(enabled = false)
	public void test3() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("passContainer")).sendKeys("hello");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		boolean errbox = driver.findElement(By.id("error_box")).isDisplayed();
		System.out.println(errbox);
	}
	
	// give wrong user name & password and click login. Check the error msg(invalid login details) shown or not
	@Test(enabled = false)
	public void test4() throws InterruptedException {
		WebElement username = driver.findElement(By.id("email"));
		Dimension size = username.getSize();
		int h = size.getHeight();
		int w = size.getWidth();
		
		System.out.println(h);
		System.out.println(w);
		
		Point loc = username.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	@Test(enabled = true)
	public void test5() throws InterruptedException {
		WebElement login = driver.findElement(By.name("login"));
		String color = login.getCssValue("background-color");
		System.out.println(color);
		String fontsize = login.getCssValue("font-size");
		System.out.println(fontsize);

		
	}
	
}
