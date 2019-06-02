package spicejet;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejetHotel {
	
	public static void main(String[] args) {
		System.out.println("Bug on it");
	}
	
	WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://www.spicejet.com/");
		
		WebElement hotelButton=driver.findElement(By.xpath("//li[@rel='mySpiceTrip']"));
		hotelButton.click();
		Thread.sleep(2000);
		
		WebElement destination=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$txtOriginStation1_MST']"));
		destination.click();
		destination.sendKeys("san diego");
		Thread.sleep(2000);
		
		
		WebElement checkInDate=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$txt_Fromdate_MST']"));
		checkInDate.click();
		checkInDate.sendKeys("08-08-2019");
		Thread.sleep(2000);
		
		
		WebElement checkoutDate=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$txt_Todate_MST']"));
		checkoutDate.click();
		checkoutDate.sendKeys("08-18-2019");
		Thread.sleep(2000);
		
		WebElement adult=driver.findElement(By.xpath("//select[@id='ddl_Adult_MST']"));
		adult.sendKeys("2");
		adult.click();
		adult.click();
		Thread.sleep(2000);
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$ButtonSubmit_MST']"));
		searchButton.click();
		
	
		
		
	}
	
	
	
	@After
	public void end() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
