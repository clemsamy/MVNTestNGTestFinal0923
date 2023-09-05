package MVNTestNGPKG;

//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MVNTestNGPGM {
	
	/*public static void main(String[] args) {
		
	   System.out.println("hello world");
	}*/
	WebDriver driver;
	
	@Test
	public void testcase1() {
		System.out.println("This is my Test Area 1");
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).click();
		//WebElement aboutPage = driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/h1"));
		String title = driver.getTitle();
		System.out.println("My current page is: "+title);
		
		//Assert.assertEquals(title,"About Selenium | Selenium");
		
	}

	@Test
	public void testcase2() {
		System.out.println("This is my Test Area 2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is my Pre-conditions Area");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\CA0\\eclipse-workspace-CAProjects\\MVNTestNGProject\\servers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is my Post-conditions Area");
		//driver.quit();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I need a valid application URL");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Close the application URL");
	}
}

