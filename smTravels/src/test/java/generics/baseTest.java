package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class baseTest {
	
	protected WebDriver driver;
	protected JavascriptExecutor js;
	protected String mobileno;
	protected String emailtxt;
	protected String passengername;
	protected String age;
	protected org.openqa.selenium.support.ui.WebDriverWait wait;
	protected String pnr_code;
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		Properties pr  = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\samir\\Downloads\\Projects SDETs\\SM Travels\\smTravels\\src\\test\\resources\\config.properties");
		
		pr.load(fis);
		String url = pr.getProperty("url");
//		String url1 = pr.getProperty("url1");
				
		driver.get(url);
//		driver.get(url1);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		js = (JavascriptExecutor) driver;
		
		mobileno = pr.getProperty("mobileno");
		emailtxt = pr.getProperty("emailtxt");
		passengername = pr.getProperty("passengername");
		age = pr.getProperty("age");
		
		wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(10));
		
		pnr_code = pr.getProperty("pnr_code");
		
	}
	
	@AfterClass
	public void teardown() {
		
//		driver.quit();
	}

	

}
