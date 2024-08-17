package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePractice {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
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
	    boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	    System.out.println(logo);

	    if(logo == true) {
	        System.out.println("Logo is available");
	    }else {
	        System.out.println("Logo is not available ");
	    }

}
	
	//Go to google.com, click gmail and check the title is Gmail or not
	@Test (enabled = false)
	public void test2() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
	  String pagetitle = driver.getTitle();
	  System.out.println(pagetitle);
	}
}
